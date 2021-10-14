package com.company.stories;

import com.company.maths.Math;
import com.company.maths.Math2;

/**
 * The type Markus.
 */
public class Markus {
    /**
     * Cheapest keyboard int.
     * returns the cheapest keyboard from a list of keyboards
     *
     * @param keyboards the keyboards
     * @return the int
     */
    public static int cheapestKeyboard(int[] keyboards){
        return Math.min(keyboards);
    }

    /**
     * Most expensive item int.
     * returns the most expensive item(keyboards and usbs)
     *
     * @param items the items
     * @return the int
     */
    public static int mostExpensiveItem(int[] items){
        return Math.max(items);
    }

    /**
     * Affordable usb int.
     * returns the biggest affordable usb price
     *
     * @param usbs  the usbs
     * @param buget the buget
     * @return the int
     */
    public static int affordableUSB(int[] usbs, int buget){
        int max=-1;
        for (int j : usbs) {
            if (j > max && j<=buget) {
                max = j;
            }
        }
        return max;
    }

    /**
     * Both items int.
     * returns the biggest afordable price combination for both items
     * returns -1 there is no affordable price combination for markus
     *
     * @param keyboards the keyboards
     * @param usbs      the usbs
     * @param buget     the buget
     * @return the int
     */
    public static int bothItems(int[] keyboards, int[] usbs, int buget){
        int[] priceOptions=new int[keyboards.length*usbs.length];
        int c=0;
        for(int i=0; i<keyboards.length; i++){
            for(int j=0; j<usbs.length;j++){
                priceOptions[c]=keyboards[i]+usbs[j];
                c+=1;
            }
        }
        return affordableUSB(priceOptions,buget);
    }
}
