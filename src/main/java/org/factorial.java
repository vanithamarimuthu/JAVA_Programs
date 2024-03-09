package org;

public class factorial {
    public static int Fac(int n){
        if(n==1){return 1;}
        return n*Fac(n-1);
    }

    // using for loop
    public static int Fac_loop(int m){
        int i,Fact=1;
        for(i=1;i<=m;i++){
            Fact=Fact*i;
        }
        return Fact;
    }

    public static void main(String[] args) {

        System.out.println(Fac(10));
        System.out.println(Fac_loop(5));
    }
}
