package com.packageChallenge;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] intArray = {2,5,9,8,2,8,7,10,4,3};

//        Arrays.sort(intArray);
        Arrays.parallelSort(intArray);

        for(int i = 0; i< intArray.length; i++){
            System.out.print(intArray[i] + "  ");
        }

    }
}
