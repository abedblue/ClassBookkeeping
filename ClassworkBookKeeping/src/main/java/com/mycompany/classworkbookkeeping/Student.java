/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classworkbookkeeping;

import java.util.LinkedList;
/**
 *
 * @author Abe
 */
public class Student 
{
    int age;
    int birthdayMonth;
    int birthdayDay;
    String firstName;
    String lastName;
    int ID;
    double weightedGrade;
    double classPercentile;
    LinkedList<Class> myClasses;
    
    public Student(int age, int bdaymonth, int bdayday, String firstname, String lastname, int ID)
    {
        this.age = age;
        this.birthdayMonth = bdaymonth;
        this.birthdayDay = bdayday;
        this.firstName = firstname;
        this.lastName = lastname;
        this.ID = ID;
        myClasses = new LinkedList<Class>();
    }
}
