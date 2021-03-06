// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

@file:JvmName("CidrUtil")

package org.jetbrains.kotlin.idea.util

import com.intellij.util.PlatformUtils

// Currently CIDR IDEs (CLion and AppCode) have no Java support.
// Use this property to bypass Java-specific logic in CIDR.
val isRunningInCidrIde: Boolean by lazy(LazyThreadSafetyMode.PUBLICATION) {
    PlatformUtils.isCidr()
}
