package com.packageChallenge;

public class RadixWithCountingSort {
    public static void main(String[] args) {

//        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};
//
//
//        radixSort(radixArray, 10, 4);

        String[] radixArray ={"bcdef","dbaqc", "abcde", "omadd", "bbbbb"};
        radixSort(radixArray, 26, 5);

        for (int i = 0; i < radixArray.length; i++){
            System.out.println(radixArray[i]);
        }

    }

//    public static void radixSort(int[] input, int radix, int width){
//        for(int i  =0; i< width; i++){
//            radixSingleSort(input, i , radix);
//        }
//    }

    public static void radixSort(String[] input, int radix, int width){
        for(int i  = width-1; i>= 0; i--){
            radixSingleSort(input, i , radix);
        }
    }

    public static void radixSingleSort(String [] input, int position, int radix){

        int numItems = input.length;

        int[] countarray = new int [radix];

        for(String  value : input){
            countarray[getIndex(position, value)]++;

        }
//        Adjust the count array

        for(int j =1;  j< radix; j++){
            countarray[j] += countarray[j-1];
        }

        String[] temp = new String[numItems];

        for(int temIndex = numItems-1; temIndex >=0; temIndex--){
            temp[--countarray[getIndex(position, input[temIndex])]] = input[temIndex];

        }

        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }


    }

    public static int getDigit (int position, int value, int radix){
        return value / (int) Math.pow(radix, position) % radix;
    }

    public static int getIndex (int position, String value){
        return value.charAt(position) - 'a';
    }




}
