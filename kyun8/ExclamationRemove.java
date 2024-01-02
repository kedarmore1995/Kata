package com.kyun8;

//Description:
// Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.
//
// Examples
// replace("Hi!") === "H!!"
// replace("!Hi! Hi!") === "!H!! H!!"
// replace("ABCDE") === "!BCD!"
// replace("aeiou") === "!!!!!"

public class ExclamationRemove {

    public static void remove(String s, int n){
        for(int i = 1; i<=n; i++){
            s = s.replace("!","");
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        ExclamationRemove.remove("Hi!",1);
    }
}