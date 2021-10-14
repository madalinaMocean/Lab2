package com.company.stories;

import java.util.Arrays;
import com.company.maths.Math;
import com.company.maths.Math2;

/**
 * The type Grading.
 */
public class Grading {

    /**
     * Rounding int.
     * rounds a grade
     *
     * @param grade the grade
     * @return the int
     */
    public static int rounding(int grade){
        if(grade<38){
            return grade;
        }
        //50->50, 51->50, 52->50, 53->55, 54->55, 55->55, 56->55, 57->55, 58->60, 59->60
        int roundedGrade=grade;
        if(roundedGrade%10<=2 || roundedGrade%10>=8){
            if(roundedGrade%10>=8){
                roundedGrade+=10;
            }
            roundedGrade-=roundedGrade%10;

        }
        else{
            roundedGrade=roundedGrade/10*10+5;
        }
        return roundedGrade;
    }

    /**
     * Insufficient grade int [ ].
     * returns a list of insufficient grades
     *
     * @param grades the grades
     * @return the int [ ]
     */
    public static int[] insufficientGrade(int[] grades){
        //int[] insufficientGradeList = new int[]{};
        int c=0;
        for(int i:grades){
            if(i<38){
                c+=1;
            }
        }
        int[] insufficientGradeList = new int[c];
        int k=0;
        for(int i:grades){
            if(i<38){
                insufficientGradeList[k]=i;
                k+=1;
            }
        }
        return insufficientGradeList;
    }

    /**
     * Average grade int.
     * returns the average grade
     *
     * @param grades the grades
     * @return the int
     */
    public static int averageGrade(int[] grades){
        return Arrays.stream(grades).sum()/grades.length;
    }

    /**
     * Rounded grades int [ ].
     * returns a list of rounded grades
     *
     * @param grades the grades
     * @return the int [ ]
     */
    public static int[] roundedGrades(int[] grades){
        int[] copyGrades= new int[grades.length];
        for(int i=0; i<copyGrades.length; i++){
            copyGrades[i]=rounding(grades[i]);
        }
        return copyGrades;
    }

    /**
     * Max rounded grade int.
     * returns the maximum of a rounded grades list
     *
     * @param grades the grades
     * @return the int
     */
    public static int maxRoundedGrade(int[] grades){
        int[] roundedList=roundedGrades(grades);
        return Math.max(roundedList);
    }


}
