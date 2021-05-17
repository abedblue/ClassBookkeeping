/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classworkbookkeeping;

/**
 *
 * @author Abe
 */
public class Classwork 
{
    public String title;
    public double weight;
    public int dayDue;
    public int monthDue;
    public int yearDue;
    public boolean test;
    public boolean quiz;
    public boolean homework;
    public boolean inClass;
    public Class myClass;
    
    public Classwork(String title, double weight, int daydue, int monthdue, int yeardue, boolean test, boolean quiz, boolean inclass, Class c)
    {
        this.title = title;
        this.weight = weight;
        this.dayDue = daydue;
        this.monthDue = monthdue;
        this.yearDue = yeardue;
        this.test = test;
        this.quiz = quiz;
        this.inClass = inclass;
        this.myClass = c;
    }
}
