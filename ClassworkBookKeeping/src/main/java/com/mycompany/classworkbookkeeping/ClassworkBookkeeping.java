/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classworkbookkeeping;

import java.util.LinkedList;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author Abe
 */
public class ClassworkBookkeeping 
{
    public static LinkedList<Class> myClasses = new LinkedList<Class>();
    
    public static void addClass(int year, String name)
    {
        myClasses.add(new Class(year, name));
    }
    
    public static void addStudent(Student myStudent, Class myClass)
    {
        myClass.myStudents.add(myStudent);
        myStudent.myClasses.add(myClass);
    }
    
    public static void addClasswork(String title, double weight, int daydue, int monthdue, int yeardue, boolean test, boolean quiz, boolean inclass, Class c)
    {
        c.myClasswork.add(new Classwork(title, weight, daydue, monthdue, yeardue, test, quiz, inclass, c));
    }
    
    public static Student findStudentByID(Class c, int ID)
    {
        for(int i = 0; i < c.myStudents.size(); i++)
        {
            if(c.myStudents.get(i).ID == ID)
            {
                return c.myStudents.get(i);
            }
        }
        return null;
    }
    
    public static void recordWork(int studentID, Classwork thisClasswork, Class c)
    {
        
    }
    
    public static void main(String args[])
    {
        
    }
    
}
