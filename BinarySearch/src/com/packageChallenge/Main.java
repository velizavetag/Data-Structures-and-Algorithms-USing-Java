package com.packageChallenge;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] intArray = {-22, -15, 1, 7, 20, 35, 55 };


        System.out.println(iterativeBinarySerch(intArray, -15));
        System.out.println(iterativeBinarySerch(intArray, 999));
        System.out.println("======================");

        System.out.println(" 20 is at the poisition: " + recursiveBinarySearch(intArray, 20));
        System.out.println(recursiveBinarySearch(intArray, 88));


    }


        public static int iterativeBinarySerch (int[] input, int value){

                int start = 0;
                int end = input.length;

                while(start < end){
                    int midPoint = (start + end)/2;
                    if(input[midPoint] == value){
                        return midPoint;
                    } else if(input[midPoint ] < value){

                        start = midPoint + 1;
                    } else{
                        end = midPoint;
                    }
                }

                return -1;
        }


        public static  int recursiveBinarySearch(int[] input, int value){
            return recursiveBinarySearch(input, 0, input.length, value);
        }

        public static int recursiveBinarySearch(int[] input, int start, int end, int value){
            if(start >= end){
                return -1;
            }

            int midPoint = (start+end)/2;
            if(input[midPoint] == value){
                return midPoint;
            } else if(input[midPoint] < value){
                return recursiveBinarySearch(input, midPoint + 1, end, value);

            } else{
                return recursiveBinarySearch(input, start, midPoint, value);
            }

        }


    }


