package org;

public class newS_TEST {
    public static void main(String[] args) {
        String str12 = "I live in india";

        int i=0;
        int len1 = str12.length()-1;
        int j= str12.length()-1;
        char[] ch =new char[str12.length()];

        while(i<= len1 && j>=0){

            ch[i++] = str12.charAt(j--);


        }

        System.out.println(ch);
    }
}
