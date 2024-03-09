package org;

import java.util.Arrays;

public class remove_dublicate_array {

    public static void main(String[] args) {
        int[] arr = {1,1,22,22,4,4,5,6};
        int j=0;
        int len=arr.length;
        Arrays.sort(arr);
        int[] temp = new int[len];

        for(int i=0;i<len-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            }

        }
        //temp[j++]=arr[len-1];
        for(int i=0;i<j;i++){
            System.out.println(temp[i]);
        }

        System.out.println(Arrays.toString(temp));

    }
}
