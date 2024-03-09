package org;

public class String_First_Occurance {
    public static void main(String[] args) {
        System.out.println(Str_Occurance("leetcode","leet"));
        System.out.println(Str_Occurance("leetcode","leeto"));

        System.out.println("another methode using sustring method");
        System.out.println(methode1("leetcode","leet"));
        System.out.println(methode1("leetcode","leeto"));
    }

    public  static  int methode1(String haystack1,String needle1){
        if(haystack1.length() < needle1.length()){
            return -1;
        }

        for(int i=0,j=needle1.length();j<=haystack1.length();i++,j++){
            if(haystack1.substring(i,j).equals(needle1)){
                return i;
            }
        }
        return -1;
    }

    public static int Str_Occurance(String haystack,String needle){

        if(haystack.length() < needle.length()){
            return -1;
        }
        int count = 0;
        for(int i=0;i<=haystack.length()-1;i++){
            if(haystack.charAt(i) == needle.charAt(count)){
                count++;
            }
            else if(haystack.charAt(i) != needle.charAt(count)){
                i-=count;
                count=0;
            }
            // adding if condition once if count is equals to needle
            // then it will return value so no need to keep on iterate
            if(count == needle.length()){
                return i-=count-1;
            }

        }

            return -1;

    }
}
