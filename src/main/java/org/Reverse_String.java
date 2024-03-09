package org;
import java.util.*;

public class Reverse_String {


    public static void main(String[] args) {

        //using loop for reverse the string
        String str ="Ganesh";
        char[] rev = new char[str.length()];

        for(int i=str.length()-1,j=0;i>=0 && j<str.length();i--,j++){
            rev[j] = str.charAt(i);

        }
        System.out.println(rev);




        //Using the string builder
        StringBuilder newstr = new StringBuilder(str);
        newstr.reverse();
        System.out.println(newstr);

        //Using swap with third element
        char[] array = {'h','e','l','l','o'};
        int i=array.length-1;
        int j=0;
        while(i>j){
            char temp=array[i];
            array[i--]=array[j];
            array[j++]=temp;

        }
        System.out.println(array);

        for(int a=array.length-1,b=0;a>b;a--,b++){
            char third = array[a];
            array[a]=array[b];
            array[b] = third;

        }

        System.out.println(array);





    }




}
