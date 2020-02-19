package com.github.perscholas.service;

import com.github.perscholas.dao.StudentDao;
import com.github.perscholas.model.CourseInterface;
import com.github.perscholas.model.Student;
import com.github.perscholas.model.StudentInterface;
import com.github.perscholas.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// TODO - Implement respective DAO interface

public class StudentService implements StudentDao {

    private final DatabaseConnection dbc;

    public StudentService(DatabaseConnection dbc){
        this.dbc = dbc;
    }

    public StudentService(){
        this(DatabaseConnection.MARIADB);
    }

    public List<StudentInterface> getAllStudents(){
        List<StudentInterface> list = new ArrayList<>();
        try {
            ResultSet result = dbc.executeQuery("SELECT * FROM student;");
            while (result.next()){
                String studentEmail = result.getString("email");
                String name = result.getString("name");
                String password = result.getString("password");
                StudentInterface student = new Student(studentEmail, name, password);
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       return list;
    }

    public StudentInterface getStudentByEmail(String studentEmail){
        try{
            String sqlStatement = "SELECT * FROM `student` " +
                    "WHERE `email`='" + studentEmail + "';";
            ResultSet result = dbc.executeQuery(sqlStatement);
            while (result.next()){
                String foundStudentEmail = result.getString("email");
                String foundName = result.getString("name");
                String foundPassword = result.getString("password");
                StudentInterface foundStudent = new Student(foundStudentEmail, foundName, foundPassword);
//                System.out.println("student: " + foundStudent);
                return foundStudent;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean validateStudent(String studentEmail, String password){
        StudentInterface student = getStudentByEmail(studentEmail);
        if (password.equals(student.getPassword())){
            return true;
        }
        return false;
    }

    public void registerStudentToCourse(String studentEmail, int courseId){

    }

    public List<CourseInterface> getStudentCourses(String studentEmail){
        return null;
    }
}
