package com.example.myideademo;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectCloseHandler;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class MyListenerClass implements ProjectCloseHandler {
    @Override
    public boolean canClose(@NotNull Project project) {
        Messages.showMessageDialog(project, "Have you pushed all codes to the Github!?", "Warning-Github", Messages.getWarningIcon());
        return true;
    }
}
