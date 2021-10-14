package com.company.stories;

import com.company.maths.Math;
import com.company.maths.Math2;

public class Markus {
    public static int cheapestKeyboard(int[] keyboards){
        return Math.min(keyboards);
    }

    public static int mostExpensiveItem(int[] items){
        return Math.max(items);
    }

    public static int affordableUSB(int[] usbs, int buget){
        int max=-1;
        for (int j : usbs) {
            if (j > max && j<=buget) {
                max = j;
            }
        }
        return max;
    }

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
