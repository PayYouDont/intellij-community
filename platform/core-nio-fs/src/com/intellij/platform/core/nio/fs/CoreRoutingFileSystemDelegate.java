// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.platform.core.nio.fs;

import java.nio.file.Path;

public interface CoreRoutingFileSystemDelegate {
  Path wrap(Path result);

  boolean isMountedFSPath(CorePath path);
}
