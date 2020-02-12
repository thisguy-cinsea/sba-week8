package com.github.curriculeon.service;

import com.github.curriculeon.model.CourseInterface;
import com.github.curriculeon.model.StudentInterface;

import java.util.List;

/**
 * @author leonhunter
 * @created 02/12/2020 - 5:57 PM
 */
public interface StudentServiceInterface {
    List<StudentInterface> getAllStudents();
    StudentInterface getStudentByEmail(String email);
    Boolean validateStudent(String email, String password);
    void registerStudentToCourse(String studentEmail, int courseId);
    List<CourseInterface> getStudentCourses(String studentEmail);
    List<CourseInterface> getAllCourses();
}
