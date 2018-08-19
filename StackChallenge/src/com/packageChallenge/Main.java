package com.packageChallenge;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Hello"));
        System.out.println(checkForPalindrome("Don't nod"));

    }

    public static boolean checkForPalindrome(String string){

        LinkedList<Character> stack = new LinkedList<>();

        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowercase = string.toLowerCase();



        for(int i = 0; i < lowercase.length(); i++){
            char c = lowercase.charAt(i);

            if(c >= 'a' && c <= 'z'){
                stringNoPunctuation.append(c);
                stack.push(c);
            }


        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while( ! stack. isEmpty()){
            reversedString.append(stack.pop());
        }


        return reversedString.toString().equalsIgnoreCase(stringNoPunctuation.toString());
    }
}
