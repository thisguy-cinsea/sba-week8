package com.github.curriculeon;

import com.github.curriculeon.utils.IOConsole;

import java.util.ArrayList;
import java.util.List;

public class SchoolManagementSystem implements Runnable {
    private static final IOConsole console = new IOConsole();

    public void run() {
        String smsDashboardInput = getSchoolMangementSystemDashboardInput();
        if ("login".equals(smsDashboardInput)) {
            String studentDashboardInput = getStudentDashboardInput();
            if ("register".equals(studentDashboardInput)) {
                Integer courseId = getCourseRegistryInput();
                // TODO
            }
        }
    }

    private String getSchoolMangementSystemDashboardInput() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to the School Management System Dashboard!")
                .append("\nFrom here, you can select any of the following options:")
                .append("\n\t[ login ], [ logout ]")
                .toString());
    }

    private String getStudentDashboardInput() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to the Student Dashboard!")
                .append("\nFrom here, you can select any of the following options:")
                .append("\n\t[ register ], [ logout]")
                .toString());
    }


    private Integer getCourseRegistryInput() {
        List<Integer> listOfCoursesIds = new ArrayList<>();
        return console.getIntegerInput(new StringBuilder()
                .append("Welcome to the Course Registration Dashboard!")
                .append("\nFrom here, you can select any of the following options:")
                .append("\n\t" + listOfCoursesIds.toString())
                .toString());
    }
}
