package java112.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;

/**
 *  This is a JavaBean that will set several instance variables for Easter Raffle app.
 *
 *@author mtimm
 */

 public class EasterRequestData {

    /* Instance Variables */
    private String name;
    private String phone;
    private int age;
    private String grade;

    /**
     *  Gets the name attribute
     *
     *@return name
     */
    public String getName() {
        return name;
    }

    /**
     *  Sets the name attribute
     *
     *@param name new Data value
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     *  Gets the phone attribute
     *
     *@return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     *  Sets the phone attribute
     *
     *@param name new Data value
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     *  Gets the age attribute
     *
     *@return age
     */
    public String getAge() {
        return age;
    }

    /**
     *  Sets the age attribute
     *
     *@param age new Data value
     */
    public void setAge(String age) {
        this.age = age;
    }
    /**
     *  Gets the grade attribute
     *
     *@return grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     *  Sets the grade attribute
     *
     *@param grade new Data value
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }
 }