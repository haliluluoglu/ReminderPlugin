package com.example.myideademo;

import com.intellij.ide.actions.ExitAction;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

import java.awt.event.ActionEvent;
import java.util.EventListener;

public class HelloAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
//        Messages.showMessageDialog(e.getProject(), "Hello", "MyIdeaDemo", Messages.getInformationIcon());
    }
}
