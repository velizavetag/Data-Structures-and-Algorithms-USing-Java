package com.packageChallenge;

import java.util.LinkedList;

public class QueChallenge {
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
        LinkedList<Character> queue = new LinkedList<>();
        String lowerCase = string.toLowerCase();

        for(int i = 0; i < lowerCase.length(); i++){
            char c = lowerCase.charAt(i);
            if( c>= 'a' && c <= 'z'){
                queue.addLast(c);
                stack.push(c);
            }
        }

        while(!stack.isEmpty()){
            if(!stack.pop().equals(queue.removeFirst())){
                return false;
            }
        }

        return true;
    }
}
