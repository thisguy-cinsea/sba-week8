package com.github.perscholas;

import java.sql.Connection;

/**
 * @author leonhunter
 * @created 02/12/2020 - 8:27 PM
 */
public class JdbcConfigurator {
    // TODO - Implement singleton design to reference a single connection-instance across classes
    public static synchronized Connection getConnection() {
        return null;
    }

    public static void initialize() {
        // TODO - Implement JDBC registration process
    }
}
