package com.company;
import com.company.maths.Math;
import com.company.maths.Math2;
import com.company.stories.Grading;
import com.company.stories.Markus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Math m=new Math();
        System.out.println("Aufgabe 2:");

        int[] array=new int[]{10,2,5,8,9,30,0};

        Math2.printArray(array);
        System.out.println();

        System.out.println("The minim is:"+ Math.min(array));
        System.out.println("The maxim is:"+ Math.max(array));
        System.out.println("The max Sum is:"+m.sumMax(array));
        System.out.println("The min Sum is:"+m.sumMin(array));

        System.out.println();

        System.out.println("Aufgabe 3:");
        Scanner nr=new Scanner(System.in);

        System.out.print("enter nr1: ");
        int nr1=nr.nextInt();

        System.out.print("enter nr2: ");
        int nr2=nr.nextInt();


        int[]a1= Math2.makeArray(nr1);
        Math2.printArray(a1);

        System.out.println();

        int[]a2= Math2.makeArray(nr2);
        Math2.printArray(a2);

        System.out.println();

        System.out.println("the sum of the two given numbers as array:");
        Math2.printArray(Math2.sum(a1,a2));

        System.out.println();

        System.out.println("the diff of the given numbers as array:");
        Math2.printArray(Math2.diff(a1,a2));

        System.out.println();

        System.out.print("enter a digit number for div and mul: ");
        int digit=nr.nextInt();

        System.out.println();

        System.out.println("the mul of the first number and 6 as array:");
        Math2.printArray(Math2.mul(a1,digit));

        System.out.println();

        System.out.println("the div of the first number and 2 as array:");
        try {
            Math2.printArray(Math2.div(a1, digit));
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();

        //grading
        System.out.println("Aufgabe1:");
        int[] grades=new int[]{31,75,79,90,96,46,74,33,29,12,36};
        Math2.printArray(grades);
        System.out.println();
        System.out.println("Insuficient grade list:");
        Math2.printArray(Grading.insufficientGrade(grades));
        System.out.println();
        System.out.println("The average grade is:");
        System.out.println(Grading.averageGrade(grades));
        System.out.println("The rounded grade list is:");
        Math2.printArray(Grading.roundedGrades(grades));
        System.out.println();
        System.out.println("The max rounded grade is:");
        System.out.println(Grading.maxRoundedGrade(grades));

        //Markus
        System.out.println("Aufgabe4:");
        int[] keyboards=new int[]{40,50,60};
        System.out.println("The keyboards list is:");
        Math2.printArray(keyboards);
        System.out.println();
        int[] usbs=new int[]{8,12};
        System.out.println("The usbs list is:");
        Math2.printArray(usbs);
        System.out.println();
        System.out.println("The cheapest keyboard is:");
        System.out.println(Markus.cheapestKeyboard(keyboards));
        System.out.println("The most expensive keyboard is:");
        System.out.println(Markus.mostExpensiveItem(keyboards));
        System.out.println("The most expensive USB is:");
        System.out.println(Markus.mostExpensiveItem(usbs));
        int buget=60;
        System.out.println("Marcus's buget is: "+buget);
        System.out.println("The most expensive usb that Markus can buy: ");
        System.out.println(Markus.affordableUSB(usbs,buget));
        System.out.println("The best combination of items Markus can buy on his budget: ");
        System.out.println(Markus.bothItems(keyboards,usbs,buget));





    }
}
