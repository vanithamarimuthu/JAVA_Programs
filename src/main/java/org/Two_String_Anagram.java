package org;

import java.util.Arrays;

public class Two_String_Anagram {

    public static void main(String[] args) {

        Two_String_Anagram AG = new Two_String_Anagram();
        boolean anagram = AG.Anagram("Brag", "Grab");
        if(anagram){
            System.out.println("it is anagram");

        }
        else{
            System.out.println("it is not anagram");
        }
    }

    public boolean Anagram(String s1,String s2){
        String L_s1 = s1.toLowerCase();
        String L_s2 = s2.toLowerCase();

        if(L_s1.length() != L_s2.length()){

            return false;
        }
        else{
            char[] str1 = L_s1.toCharArray();
            char[] str2 = L_s2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            if(Arrays.equals(str1, str2)){
                return true;
            }
            else{
                return false;
            }


            }


    }
}
