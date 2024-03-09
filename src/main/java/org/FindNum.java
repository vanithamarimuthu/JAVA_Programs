package org;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FindNum {

    public static void main(String[] args) {
        String str = "Test23324DFG";

        int size = str.length();


        for(int i=0; i<size-1;i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9')

                System.out.println(str.charAt(i));

        }

        int[] array ={45,78,23,98,325,8,9};
        int len = array.length-1 ;
        int temp=0;
        System.out.println(Arrays.toString(array));
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j]= array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Second largest number "+array[len-1]);




    }



}
