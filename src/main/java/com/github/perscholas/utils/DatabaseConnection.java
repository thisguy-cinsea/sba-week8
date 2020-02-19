package com.github.perscholas.utils;

import java.sql.*;

public enum DatabaseConnection {
    MARIADB;

    public Connection getConnection() {
        return getConnection(name().toLowerCase());
    }

    private Connection getConnection(String dbVendor){
        String username = "root";
        String password = "breanna1003";
        String databaseName = "SBA_week8";
        String url = "jdbc:" + dbVendor + "://127.0.0.1/";
        try {
            Connection connection = DriverManager.getConnection(url + databaseName, username, password);
            return connection;
        }catch (SQLException e) {
            try {
                Connection connection = DriverManager.getConnection(url, username, password);
                return connection;
            } catch (SQLException err) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public ResultSet executeQuery(String sqlStatement) throws SQLException {
        Connection connection = DatabaseConnection.MARIADB.getConnection();
        Statement statement = connection.createStatement();
        return statement.executeQuery(sqlStatement);
    }

}