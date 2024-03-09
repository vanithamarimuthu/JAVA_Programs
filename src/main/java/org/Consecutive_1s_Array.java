package org;

public class Consecutive_1s_Array {
    public static void main(String[] args) {
        int[] binaryArray = {1,1,0,1,1,1,0,0,1,1,1,1,0};
        int length = binaryArray.length;
        int count =0;
        int maxCount=0;

        for(int i=0;i<length;i++){
            if(binaryArray[i]==1){
                count++;
                /*
                if(maxCount<count){
                    maxCount=count;
                }
                else {count=0;}

                 */
            }
        }
        System.out.println("Maximum count of 1s : "+maxCount);
        System.out.println("count of 1s : "+count);

    }
}
