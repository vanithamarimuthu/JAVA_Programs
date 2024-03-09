package org;

import java.util.HashSet;


public class Largest_SubString {

    public static void main(String[] args) {

        System.out.println(First_Methode("abcabcbb"));
    }

    //Using HashSet
    //Find the largest substring
    public static int First_Methode(String s){
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;
        HashSet<Object> hash_set = new HashSet<>();

        while(a_pointer < s.length()){
            if(!hash_set.contains(s.charAt(a_pointer))) {
                hash_set.add(s.charAt(a_pointer));
                a_pointer++;
                max = Math.max(hash_set.size(),max);
            }
            else{
                hash_set.remove(s.charAt(b_pointer));
                b_pointer++;
            }



        }
        return max;


    }
}
