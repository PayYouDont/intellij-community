/*
 * Copyright 2000-2014 JetBrains s.r.o.
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
package org.jetbrains.plugins.groovy.unwrap;

import com.intellij.codeInsight.unwrap.UnwrapDescriptorBase;
import com.intellij.codeInsight.unwrap.Unwrapper;

public final class GroovyUnwrapDescriptor extends UnwrapDescriptorBase {
  @Override
  public Unwrapper[] createUnwrappers() {
    return new Unwrapper[]{
      new GroovyIfUnwrapper(),
      new GroovyWhileUnwrapper(),
      new GroovyTryUnwrapper(),
      new GroovySynchronizedUnwrapper(),
      new GroovyMethodParameterUnwrapper(),
      new GroovyForUnwrapper(),
      new GroovyCatchRemover(),
      new GroovyBracesUnwrapper(),
      new GroovyElseUnwrapper(),
      new GroovyElseRemover(),
      new GroovyConditionalUnwrapper(),
    };
  }
}
