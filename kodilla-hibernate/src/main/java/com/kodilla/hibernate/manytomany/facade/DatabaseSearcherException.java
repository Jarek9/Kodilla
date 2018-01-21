package com.kodilla.hibernate.manytomany.facade;

public class DatabaseSearcherException extends Exception {

    public static String ERR_NO_EMPLOYEE_FOUND = "No employee found";
    public static String ERR_NO_COMPANY_FOUND = "No company found";
    public static String ERR_SEARCH_FINISHED = "Searching error";
    public static String INFO_SEARCH_FINISHED = "Search completed";

    public DatabaseSearcherException(String message) {
        super(message);
    }
}
