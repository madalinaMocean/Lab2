package com.company.maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Math {
    private int[] array=new int[]{10,2,5,8,9,30,0};
    public int min(){
        int min=array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
    public int max(){
        int max=array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public int sumMax(){
        int[] copyArray=new int[array.length];
        for(int i=0; i< array.length; i++){
            copyArray[i]=array[i];
        }
        int sum=0;
        //System.out.println(Arrays.toString(array));
        //System.out.println(Arrays.toString(copyArray));
        Arrays.sort(copyArray);
        //System.out.println(Arrays.toString(copyArray));
        for (int c = copyArray.length - 1; c > 0; c--){
            sum=sum+copyArray[c];
        }
        return sum;
    }

    public int sumMin(){
        int[] copyArray=new int[array.length];
        for(int i=0; i< array.length; i++){
            copyArray[i]=array[i];
        }
        int sum=0;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(copyArray));
        Arrays.sort(copyArray);
        System.out.println(Arrays.toString(copyArray));
        for (int c=0;c<copyArray.length-1;c++){
            sum=sum+copyArray[c];
        }
        return sum;
    }

}
