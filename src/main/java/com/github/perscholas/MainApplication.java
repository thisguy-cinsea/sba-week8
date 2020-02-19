package com.github.perscholas;

import java.sql.SQLException;

public class MainApplication {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        JdbcConfigurator.initialize();
        Runnable sms = new SchoolManagementSystem();
        sms.run();
    }
}
