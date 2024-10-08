// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.lang.properties.editor;

import com.intellij.lang.properties.IProperty;
import com.intellij.lang.properties.PropertiesImplUtil;
import com.intellij.lang.properties.PropertiesUtil;
import com.intellij.lang.properties.psi.PropertiesFile;
import com.intellij.lang.properties.psi.Property;
import com.intellij.openapi.application.QueryExecutorBase;
import com.intellij.openapi.application.ReadAction;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.psi.PsiElement;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.search.searches.DefinitionsScopedSearch;
import com.intellij.util.Processor;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;

/**
 * @author Dmitry Batkovich
 */
public class PropertiesInheritorsSearcher extends QueryExecutorBase<PsiElement, DefinitionsScopedSearch.SearchParameters> {
  private static final Logger LOG = Logger.getInstance(PropertiesInheritorsSearcher.class);

  @Override
  public void processQuery(@NotNull DefinitionsScopedSearch.SearchParameters queryParameters, @NotNull Processor<? super PsiElement> consumer) {
    final PsiElement element = queryParameters.getElement();
    Property prop = ReadAction.compute(() -> GotoPropertyParentDeclarationHandler.findProperty(element));
    if (prop == null || !(queryParameters.getScope() instanceof GlobalSearchScope)) {
      return;
    }
    ReadAction.run(() -> {
      final String key = prop.getKey();
      if (!prop.isValid() || key == null) return;
      final PropertiesFile currentFile = PropertiesImplUtil.getPropertiesFile(prop.getContainingFile());
      LOG.assertTrue(currentFile != null);
      final GlobalSearchScope scope = (GlobalSearchScope)queryParameters.getScope();
      for (PropertiesFile f : currentFile.getResourceBundle().getPropertiesFiles()) {
        if (f.equals(currentFile) &&
            scope.contains(f.getVirtualFile()) &&
            PropertiesUtil.getParent(f, Collections.singleton(currentFile)) == currentFile) {
          IProperty byKey = f.findPropertyByKey(key);
          if (byKey != null) {
            PsiElement psiElement = byKey.getPsiElement();
            ProgressManager.checkCanceled();
            if (!consumer.process(psiElement)) {
              break;
            }
          }
        }
      }
    });
  }

}
