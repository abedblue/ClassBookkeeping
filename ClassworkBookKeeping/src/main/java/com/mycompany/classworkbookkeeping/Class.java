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
public class Class {
    public LinkedList<Student> myStudents;
    public LinkedList<Classwork> myClasswork;
    public int startYear;
    public String className;
    
    public Class(int year, String name)
    {
        this.startYear = year;
        this.className = name;
        myStudents = new LinkedList<Student>();
        myClasswork = new LinkedList<Classwork>();
    }
}
