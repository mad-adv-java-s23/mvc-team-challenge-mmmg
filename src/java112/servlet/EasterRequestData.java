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
    private String lastName;
    private String firstName;
    private String phone;
    private int age;
    private String grade;

    /**
     *  Gets the lastName attribute
     *
     *@return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *  Sets the lastName attribute
     *
     *@param lastName new Data value
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     *  Gets the firstName attribute
     *
     *@return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *  Sets the firstName attribute
     *
     *@param firstName new Data value
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
    public int getAge() {
        return age;
    }

    /**
     *  Sets the age attribute
     *
     *@param age new Data value
     */
    public void setAge(int age) {
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