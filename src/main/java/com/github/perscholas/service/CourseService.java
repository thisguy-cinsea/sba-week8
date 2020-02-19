package com.github.perscholas.service;

import com.github.perscholas.dao.CourseDao;
import com.github.perscholas.model.Course;
import com.github.perscholas.model.CourseInterface;
import com.github.perscholas.model.Student;
import com.github.perscholas.model.StudentInterface;
import com.github.perscholas.utils.DatabaseConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// TODO - Implement respective DAO interface
public class CourseService {

    private final DatabaseConnection dbc;

    public CourseService(DatabaseConnection dbc){
        this.dbc = dbc;
    }

    public CourseService(){
        this(DatabaseConnection.MARIADB);
    }

    public List<CourseInterface> getAllCourses(){
        List<CourseInterface> list = new ArrayList<>();
        try {
            ResultSet result = dbc.executeQuery("SELECT * FROM course;");
            while (result.next()){
                Integer courseId = result.getInt("id");
                String name = result.getString("name");
                String instructor = result.getString("instructor");
                CourseInterface course = new Course(courseId, name, instructor);
                list.add(course);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
