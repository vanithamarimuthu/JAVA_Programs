package org;

public class armstrong {
    public static void main(String[] args) {
        int num=153,rem,result=0;
        int temp=num;

        while(num>0){
            rem = num%10;
            num=num/10;
            result=result+(rem*rem*rem);

        }
        if(result == temp){
            System.out.println("armstrong num");
        }
        else{
            System.out.println("not armstrong num");
        }
    }
}
