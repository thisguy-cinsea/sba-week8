package com.github.curriculeon.dao;

import com.github.curriculeon.model.CourseInterface;

import java.util.List;

/**
 * @author leonhunter
 * @created 02/12/2020 - 5:56 PM
 */
public interface CourseDao {
    List<CourseInterface> getAllCourses();
}
