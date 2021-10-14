package com.company.maths;


/**
 * The type Math 2.
 */
public class Math2 {

    /**
     * Make array int [ ].
     * parses an int into an array
     *
     * @param nr the nr
     * @return the int [ ]
     */
    public static int[] makeArray(int nr){
        int len=String.valueOf(nr).length();
        int[] arr =new int[len];

        int i=arr.length-1;
        //System.out.println(i);
        while(i>=0 && nr!=0){
            //System.out.println(nr%10);
            arr[i]=nr%10;
            //System.out.println(arr[i]);
            nr=nr/10;
            i=i-1;
        }
        return arr;
    }

    /**
     * Print array.
     * prints an array
     *
     * @param array the array
     */
    public static void printArray(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+",");
        }
    }

    /**
     * Sum int [ ].
     * returns a sum in form af a list
     *
     * @param arr1 the arr 1
     * @param arr2 the arr 2
     * @return the int [ ]
     */
    public static int[] sum(int[] arr1, int[] arr2){
        int tr=0;
        int[] s=new int[arr1.length+1]; //nu are cum sa fie mai mare de atata rezultatul
        for(int i=arr1.length-1; i>=0; i--){
            s[i+1]=(arr1[i]+arr2[i]+tr)%10;

            if(arr1[i]+arr2[i]+tr>=10){
                tr=1;
            }
            else tr=0;

        }
        s[0]=tr;

        return s;
    }

    /**
     * Compare arrays boolean.
     * compares two arrays in order to subtract
     *
     * @param arr1 the arr 1
     * @param arr2 the arr 2
     * @return the boolean
     */
    public static boolean compareArrays(int[] arr1, int[] arr2){
        return toInt(arr1) > toInt(arr2); //ternary operator comparison
    }

    /**
     * To int int.
     * parses an array into an int
     *
     * @param arr1 the arr 1
     * @return the int
     */
    public static int toInt(int[] arr1){ //used only for comparison
        int result=0;
        int offset=1;
        for(int i=arr1.length-1; i>=0; i--){
            result+=arr1[i]*offset;
            offset*=10;
        }
        return result;
    }

    /**
     * Diff int [ ].
     * returns difference in form of a list
     *
     * @param arr1 the arr 1
     * @param arr2 the arr 2
     * @return the int [ ]
     */
    public static int[] diff(int[] arr1, int[] arr2){
        int tr=0;
        int[] copyArr1;
        int[] copyArr2;

        if(compareArrays(arr1,arr2)){
            copyArr1=new int[arr1.length]; //making copies
            for(int i=0; i< arr1.length; i++){
                copyArr1[i]=arr1[i];
            }

            copyArr2=new int[arr2.length];
            for(int i=0; i< arr2.length; i++){
                copyArr2[i]=arr2[i];
            }
        }
        else{
            copyArr1=new int[arr2.length]; //making copies
            for(int i=0; i< arr2.length; i++){
                copyArr1[i]=arr2[i];
            }

            copyArr2=new int[arr1.length];
            for(int i=0; i< arr1.length; i++){
                copyArr2[i]=arr1[i];
            }
        }



        int[] d=new int[copyArr1.length];
        for(int i=copyArr1.length-1; i>0; i--){

            if(copyArr1[i]-copyArr2[i]<0){
                tr=10;
                if (copyArr1[i-1]>0){
                    copyArr1[i-1]-=1;
                }
                else {
                    int j=i-1;
                    while(copyArr1[j]==0){
                        copyArr1[j]=9;
                        j-=1;
                    }
                    copyArr1[j]=copyArr1[j]-1;

                }
            }
            else tr=0;

            d[i]=(copyArr1[i]+tr-copyArr2[i])%10;
        }
        d[0]=d[0]=(copyArr1[0]+tr-copyArr2[0])%10;
        return d;
    }


    /**
     * Mul int [ ].
     * returns a product in form of a list
     *
     * @param arr1 the arr 1
     * @param nr   the nr
     * @return the int [ ]
     */
    public static int[] mul(int[] arr1, int nr){
        int t1=0;
        int t2=0;
        int tr=0;
        int[] m=new int[arr1.length+1];
        for(int i=arr1.length-1; i>=0; i--){
            t2=(arr1[i]*nr)%10;
            m[i+1]=(t2+t1+tr)%10;
            if(t2+t1+tr>=10){
                tr=1;
            }
            else tr=0;
            t1=(arr1[i]*nr)/10;
        }
        m[0]=t1+tr;

        return m;
    }

    /**
     * Div int [ ].
     * returns a division in form of a list
     *
     * @param arr1 the arr 1
     * @param nr   the nr
     * @return the int [ ]
     * @throws Exception the exception
     */
    public static int[] div(int[] arr1, int nr) throws Exception {
        int[]rez=new int[arr1.length];

        if (nr==0){
            throw new Exception("Can't divide by 0!");
        }

        int t=0;
        for(int i=0; i<arr1.length; i++){

            rez[i]=(t*10+arr1[i])/nr;
            t=(t*10+arr1[i])-rez[i]*nr;
        }
        return rez;
    }

}
