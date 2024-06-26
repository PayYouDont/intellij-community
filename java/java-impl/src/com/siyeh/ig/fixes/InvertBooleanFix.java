// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.siyeh.ig.fixes;

import com.intellij.codeInsight.intention.preview.IntentionPreviewInfo;
import com.intellij.codeInspection.ProblemDescriptor;
import com.intellij.codeInspection.util.IntentionName;
import com.intellij.java.JavaBundle;
import com.intellij.openapi.project.Project;
import com.intellij.refactoring.JavaRefactoringActionHandlerFactory;
import com.intellij.refactoring.RefactoringActionHandler;
import com.siyeh.InspectionGadgetsBundle;
import org.jetbrains.annotations.NotNull;

/**
 * @author Bas Leijdekkers
 */
public class InvertBooleanFix extends RefactoringInspectionGadgetsFix {

  private final @IntentionName String myName;

  public InvertBooleanFix(@IntentionName String name) {
    myName = name;
  }

  @Override
  public @NotNull String getName() {
    return myName;
  }

  @Override
  public @NotNull String getFamilyName() {
    return InspectionGadgetsBundle.message("invert.quickfix.family.name");
  }

  @Override
  public @NotNull RefactoringActionHandler getHandler() {
    return JavaRefactoringActionHandlerFactory.getInstance().createInvertBooleanHandler();
  }

  @Override
  public @NotNull IntentionPreviewInfo generatePreview(@NotNull Project project, @NotNull ProblemDescriptor previewDescriptor) {
    return new IntentionPreviewInfo.Html(JavaBundle.message("invert.quickfix.preview"));
  }
}
