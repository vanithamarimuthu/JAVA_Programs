package org;

public class prime_number {

    public static void main(String[] args) {
        int num = 33;
        if(prime(num)){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }

    public static Boolean prime(int n){

        if(n <= 0){
            return false;
        }

        for (int i=2; i<Math.sqrt(n);i++ ){ // or we can use for (int i=2; i<n/2;i++ )
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
