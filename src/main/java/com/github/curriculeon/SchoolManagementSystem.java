package com.github.curriculeon;

import com.github.curriculeon.utils.IOConsole;

public class SchoolManagementSystem implements Runnable {
    private static final IOConsole console = new IOConsole();

    public void run() {
        String userLoginDecision = getUserLoginDecision();
        if("login".equals(userLoginDecision)) {
            String studentDecision = getStudentDecision();
            if("register".equals(studentDecision)) {
                // TODO
            }
        }
    }

    private String getUserLoginDecision() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to the School Management System!")
                .append("\nFrom here, you can select any of the following options:")
                .append("\n\t[ login ], [ logout ]")
                .toString());
    }

    private String getStudentDecision() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to the Student dashboard!")
                .append("\nFrom here, you can select any of the following options:")
                .append("\n\t[ register ], [ logout]")
                .toString());
    }
}
