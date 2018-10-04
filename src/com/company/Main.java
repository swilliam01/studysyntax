package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String animal ="";
        int age;
        String response="yes";
        String anotherString;
        do {
        System.out.println("what is your favorite animal?");
        animal=sc.nextLine();
        System.out.println("what is the age of your anmial");
        System.out.println("animal is"+age);
        System.out.println("age is"+age);
        if (age%2==0) {
            System.out.println("age");
        }
        response=sc.nextLine();
        }while(!response.equalsIgnoreCase(anotherString "no");



    }
}
