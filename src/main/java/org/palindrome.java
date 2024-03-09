package org;

public class palindrome {

    public Boolean Palindrome(String str){
        int len = str.length();
        for (int i=0;i<len-1;i++){
            String lowStr=str.toLowerCase();
            if(lowStr.charAt(i)!= lowStr.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
    public static Boolean Palin_Num(int num){
        int temp=num;
        int rem,sum=0;
        while(num>0){
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;

        }
        if(temp!=sum){
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        palindrome pp =new palindrome();
        if(Palin_Num(151)){
            System.out.println("Palindrome number");
        }

        else{
            System.out.println("not a Palindrome number");
        }

        if(pp.Palindrome("Madam2")){
            System.out.println("palindrome");
        }
        else{
            System.out.println("is not palindrome");
        }

    }
}
