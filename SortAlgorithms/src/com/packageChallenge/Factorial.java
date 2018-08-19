package com.packageChallenge;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(iterativeFactoriaal(3));
        System.out.println(recursiveFactorial(3));

    }

    public static int iterativeFactoriaal(int num){
        if(num == 0){
            return 1;
        }

        int factorial = 1;
        for(int i =1; i<= num; i++){
            factorial *=i;
        }

        return factorial;
    }

    public static int recursiveFactorial(int num){

//        n! = n * (n-1)!

        if (num ==0 ){
            return 1;
        }

        return num * recursiveFactorial(num -1);
    }
}
