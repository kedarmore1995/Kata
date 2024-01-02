package com.kyun8;
//Description:
// Remove n exclamation marks in the sentence from left to right.
// n is positive integer.
//
//        Examples
//        remove("Hi!",1) === "Hi"
//        remove("Hi!",100) === "Hi"
//        remove("Hi!!!",1) === "Hi!!"
//        remove("Hi!!!",100) === "Hi"
//        remove("!Hi",1) === "Hi"
//        remove("!Hi!",1) === "Hi!"
//        remove("!Hi!",100) === "Hi"
//        remove("!!!Hi !!hi!!! !hi",1) === "!!Hi !!hi!!! !hi"
//        remove("!!!Hi !!hi!!! !hi",3) === "Hi !!hi!!! !hi"
//        remove("!!!Hi !!hi!!! !hi",5) === "Hi hi!!! !hi"
//        remove("!!!Hi !!hi!!! !hi",100) === "Hi hi hi"
public class ExclamationReplace {
    public void replaceEx( String s) {
        //coding and coding....
        s = s.replaceAll("[aeiouAEIOU]","!");
        System.out.println(s);
    }

    public static void main(String[] args) {
        ExclamationReplace exRp = new ExclamationReplace();
        exRp.replaceEx("Hi!");
    }
}