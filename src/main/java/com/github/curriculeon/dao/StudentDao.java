package com.github.curriculeon.dao;

import com.github.curriculeon.model.CourseInterface;
import com.github.curriculeon.model.StudentInterface;

import java.util.List;

/**
 * @author leonhunter
 * @created 02/12/2020 - 5:55 PM
 */
public interface StudentDao {
    List<StudentInterface> getAllStudents();
    StudentInterface getStudentByEmail(String email);
    Boolean validateStudent(String email, String password);
    void registerStudentToCourse(String studentEmail, int courseId);
    List<CourseInterface> getStudentCourses(String studentEmail);
}
