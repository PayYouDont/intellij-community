/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.jps.model.serialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.model.JpsModel;
import org.jetbrains.jps.model.JpsProject;
import org.jetbrains.jps.service.JpsServiceManager;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

public abstract class JpsSerializationManager {
  public static JpsSerializationManager getInstance() {
    return JpsServiceManager.getInstance().getService(JpsSerializationManager.class);
  }

  protected JpsSerializationManager() {
  }

  @NotNull
  public JpsModel loadModel(@NotNull String projectPath, @Nullable String optionsPath) throws IOException {
    return loadModel(projectPath, optionsPath, false);
  }

  @NotNull
  public abstract JpsModel loadModel(@NotNull String projectPath, @Nullable String optionsPath, boolean loadUnloadedModules) throws IOException;

  /**
   * Loads project configuration and global options from the given {@code projectPath} and {@code optionsPath}.
   *
   * @param projectPath path to the directory containing .idea or to *.ipr file
   * @param externalConfigurationDirectory path to the directory containing configuration of parts imported from external systems
   * @param optionsPath path to {@code ${idea.config.path}/options} directory 
   */
  @NotNull
  public abstract JpsModel loadModel(@NotNull Path projectPath, @Nullable Path externalConfigurationDirectory, @Nullable Path optionsPath,
                                     boolean loadUnloadedModules) throws IOException;

  /**
   * Loads project without unloaded modules.
   */
  @NotNull
  public abstract JpsProject loadProject(@NotNull String projectPath, @NotNull Map<String, String> pathVariables) throws IOException;

  @NotNull
  public abstract JpsProject loadProject(@NotNull String projectPath, @NotNull Map<String, String> pathVariables,
                                         boolean loadUnloadedModules) throws IOException;

  /**
   * Loads project configuration from the given {@code projectPath}.
   * @param projectPath path to the directory containing .idea or to *.ipr file
   * @param externalConfigurationDirectory path to the directory containing configuration of parts imported from external systems                   
   */
  @NotNull
  public abstract JpsProject loadProject(@NotNull Path projectPath,
                                         @Nullable Path externalConfigurationDirectory,
                                         @NotNull Map<String, String> pathVariables,
                                         boolean loadUnloadedModules) throws IOException;
}
