package com.company.maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * The type Math.
 */
public class Math {
    /**
     * Min int.
     * returns smallest elem from an array
     *
     * @param array the array
     * @return the int
     */
//private int[] array=new int[]{10,2,5,8,9,30,0};
    public static int min(int[] array){
        int min=array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    /**
     * Max int.
     * returns biggest elem from an array
     *
     * @param array the array
     * @return the int
     */
    public static int max(int[] array){
        int max=array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    /**
     * Sum max int.
     * returns the maximum sum from an array
     *
     * @param array the array
     * @return the int
     */
    public int sumMax(int[] array){
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

    /**
     * Sum min int.
     *  returns the minimum sum from an array
     *
     * @param array the array
     * @return the int
     */
    public int sumMin(int[] array){
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
