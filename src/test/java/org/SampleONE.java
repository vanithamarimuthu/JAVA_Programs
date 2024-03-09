package org;


import java.util.Arrays;

public class SampleONE {
    public static void main(String[] args) {

       int[] arrays={1,2,2,4,4,3,5,5,6,7};
       int remove_Num = 5;
        System.out.println(Arrays.toString(Remove_Element(arrays, remove_Num)));

         if(Leap_year(1700)){
             System.out.println("it is leap year");
         }
         else {
             System.out.println("it is not leap year");
         }

    }

    public static int[] Remove_Element(int[] array,int num){

        int[] new_list = new int[array.length-1];
        int index =0;
        for (int j : array) {
            if (j != num) {
                new_list[index] = j;
                index++;
            }
        }

        return new_list;
    }

    public static Boolean Leap_year(int year){
        Boolean result = false;
        if(year%4==0){
            return result=true;

        }
        else
        {
            return result=false;
        }
    }
}
