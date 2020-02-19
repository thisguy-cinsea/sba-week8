package com.github.perscholas.service.courseservice;

import com.github.perscholas.JdbcConfigurator;
import com.github.perscholas.utils.DirectoryReference;
import org.junit.Before;

import java.io.File;
import java.sql.SQLException;

/**
 * @author leonhunter
 * @created 02/12/2020 - 8:26 PM
 */
public class GetAllCoursesTest {
    @Before // TODO (OPTIONAL) - Use files to execute SQL commands
    public void setup() {
        DirectoryReference directoryReference = DirectoryReference.RESOURCE_DIRECTORY;
        File coursesSchemaFile = directoryReference.getFileFromDirectory("courses.create-table.sql");
        File studentsSchemaFile = directoryReference.getFileFromDirectory("students.create-table.sql");
        File coursesPopulatorFile = directoryReference.getFileFromDirectory("courses.populate-table.sql");
        File studentsPopulatorFile = directoryReference.getFileFromDirectory("students.populate-table.sql");
        File[] filesToExecute = new File[]{
                coursesSchemaFile,
                studentsSchemaFile,
                coursesPopulatorFile,
                studentsPopulatorFile
        };
    }

    // given
    private void test() throws SQLException, ClassNotFoundException {
        JdbcConfigurator.initialize();

        // when
        // TODO - define `when` clause


        // then
        // TODO - define `then` clause
    }
}
