package org;

public class fibonacci {
    public static void main(String[] args) {
        int n1=0,n2=1,sum,count=10;
        System.out.print(n1+","+n2);
        //Loop start with 2 because already printed 0 ,1
        for(int i=2;i<=count;i++){

            sum=n1+n2;//adding first 2 number eg: 0+1
            System.out.print(","+sum); //eg: 1 will print
            n1=n2;//n1 = 1
            n2=sum;//n2 = 1

        }
    }
}
