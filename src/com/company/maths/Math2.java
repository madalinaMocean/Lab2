package com.company.maths;


public class Math2 {

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

    public static void printArray(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+",");
        }
    }

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

    public static boolean compareArrays(int[] arr1, int[] arr2){
        return toInt(arr1) > toInt(arr2); //ternary operator comparison
    }

    public static int toInt(int[] arr1){ //used only for comparison
        int result=0;
        int offset=1;
        for(int i=arr1.length-1; i>=0; i--){
            result+=arr1[i]*offset;
            offset*=10;
        }
        return result;
    }

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
