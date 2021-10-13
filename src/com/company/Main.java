package com.company;
import com.company.maths.Math;
import com.company.maths.Math2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Math m=new Math();
        System.out.println("The minim is:"+m.min());
        System.out.println("The maxim is:"+m.max());
        System.out.println("The max Sum is:"+m.sumMax());
        System.out.println("The min Sum is:"+m.sumMin());


        Scanner nr=new Scanner(System.in);

        System.out.print("enter nr1: ");
        int nr1=nr.nextInt();

        System.out.print("enter nr2: ");
        int nr2=nr.nextInt();

        Math2 n=new Math2();
        int[]a1=n.makeArray(nr1);
        n.printArray(a1);

        System.out.println();

        int[]a2=n.makeArray(nr2);
        n.printArray(a2);

        System.out.println();

        System.out.println("the sum of the two given numbers as array:");
        n.printArray(n.sum(a1,a2));

        System.out.println();

        System.out.println("the diff of the given numbers as array:");
        n.printArray(n.diff(a1,a2));

        System.out.println();

        System.out.print("enter a digit number for div and mul: ");
        int digit=nr.nextInt();

        System.out.println();

        System.out.println("the mul of the first number and 6 as array:");
        n.printArray(n.mul(a1,digit));

        System.out.println();

        System.out.println("the div of the first number and 2 as array:");
        try {
            n.printArray(n.div(a1, digit));
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
