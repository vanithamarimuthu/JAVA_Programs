package org;

public class Pattern_Program {
    public static void main(String[] args) {

        Right_angel(5);

    }

    public static void Right_angel(int num){

        for(int i =0;i<num;i++){

            for(int j =0; j<=i;j++){

                System.out.print("* ");
            }
            System.out.println(" ");

        }
    }
}
