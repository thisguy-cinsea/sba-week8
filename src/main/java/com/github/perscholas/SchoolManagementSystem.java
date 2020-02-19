package com.github.perscholas;

import com.github.perscholas.dao.StudentDao;
import com.github.perscholas.service.StudentService;
import com.github.perscholas.utils.DatabaseConnection;
import com.github.perscholas.utils.IOConsole;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class SchoolManagementSystem implements Runnable {
    private static final IOConsole console = new IOConsole();

    @lombok.SneakyThrows
    @Override
    public void run() {
        String smsDashboardInput = getSchoolManagementSystemDashboardInput();
        if ("login".equals(smsDashboardInput.trim())) {
            StudentDao studentService = new StudentService(DatabaseConnection.MARIADB); // TODO - get literal value
            String studentEmail = console.getStringInput("Enter your email:");
            String studentPassword = console.getStringInput("Enter your password:");
//            System.out.println(studentService.getAllStudents());
//            System.out.println(studentService.getStudentByEmail(studentEmail));
            Boolean isValidLogin = studentService.validateStudent(studentEmail, studentPassword);
            System.out.println(isValidLogin);
            if (isValidLogin) {
                String studentDashboardInput = getStudentDashboardInput();
                if ("register".equals(studentDashboardInput.trim())) {
                    Integer courseId = getCourseRegistryInput();
                    studentService.registerStudentToCourse(studentEmail, courseId);
                }
            }
        }
    }

    private String getSchoolManagementSystemDashboardInput() {
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
                .append("\n\t[ register ], [ logout ]")
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
