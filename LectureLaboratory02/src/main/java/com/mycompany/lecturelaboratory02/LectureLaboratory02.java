/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecturelaboratory02;

import java.util.Scanner;

/**
 *
 * @author CollegeComlab-10
 */
public class LectureLaboratory02 {

    public static void main(String[] args) {
// READ INPUT FROM USER 
// SCANNER

// Example #1
//    Scanner objScan = new Scanner(System.in); // create a scanner object
//    System.out.println("Enter name: ");
//    String inputName = objScan.nextLine(); // Read input from user
//    System.out.println(" Your name is " + inputName);

//    nextBoolean()	Reads a boolean value from the user
//    nextByte()	Reads a byte value from the user
//    nextDouble()	Reads a double value from the user
//    nextFloat()	Reads a float value from the user
//    nextInt()         Reads a int value from the user
//    nextLine()	Reads a String value from the user
//    nextLong()	Reads a long value from the user
//    nextShort()	Reads a short value from the user

// Example #2
//    Scanner objScan = new Scanner(System.in); // create a scanner object
//    System.out.println("Enter your favourite number: ");
//    int inputNum = objScan.nextInt(); // Read input integer from user
//    System.out.println(" Your favorite number is " + inputNum);
    
// Example # 3
//    Scanner myScanner = new Scanner(System.in);
//    System.out.println("Enter name, age, and salary: ");
//   
//    String name = myScanner.nextLine();     //String input
//    
//    int age = myScanner.nextInt();          //Integer input
//    
//    double salary = myScanner.nextDouble(); //Double input
//    System.out.println("Name: " + name);
//    System.out.println("Age: " + age);
//    System.out.println("Salary: " + salary);

// Example #4 A program that converts the input weight in kg to lbs
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter weight in kilograms: ");
    float weight_kg = myScanner.nextFloat();
    System.out.println("Your weight in pounds is " + weight_kg * 2.2f);
    
    }
}
