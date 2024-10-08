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
package com.intellij.psi.impl.source.tree.injected;

import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiLanguageInjectionHost;
import com.intellij.psi.injection.ReferenceInjector;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author Dmitry Avdeev
 */
@ApiStatus.Internal
public abstract class InjectedReferenceVisitor implements PsiLanguageInjectionHost.InjectedPsiVisitor {
  @Override
  public void visit(@NotNull PsiFile injectedPsi, @NotNull List<? extends PsiLanguageInjectionHost.Shred> places) {}

  public abstract void visitInjectedReference(@NotNull ReferenceInjector injector, @NotNull List<? extends PsiLanguageInjectionHost.Shred> places);
}
