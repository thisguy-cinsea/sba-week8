package com.github.curriculeon;

public class MainApplication {
    public static void main(String[] args) {
        Runnable sms = new SchoolManagementSystem();
        sms.run();
    }
}
