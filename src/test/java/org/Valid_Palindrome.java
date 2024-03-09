package org;

public class Valid_Palindrome {

    public static void main(String[] args) {
        boolean palin = Palin("A man, a plan, a canal: Panama");
        System.out.println(palin);
    }

    public static  boolean Palin(String s){
        s= s.toLowerCase();


        int len =s.length();
        int i = 0;
        int j = s.length()-1;


        while(i<=j){
            if(!(s.charAt(i) >= 'a' && s.charAt(i)<='z' )){
                i++;
                continue;

            }
            if(!(s.charAt(j) >= 'a' && s.charAt(j)<='z')){
                j--;
                continue;

            }
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
                continue;


            }
            else{
                return false;
            }
        }


        return true;


    }
}
