package com.kyun8;

//Filter the number
//        Oh, no! The number has been mixed up with the text.
//        Your goal is to retrieve the number from the text,
//        can you return the number back to its original state?
//
//        Task
//        Your task is to return a number from a string.
//
//        Details
//        You will be given a string of numbers and letters mixed up,
//        you have to return all the numbers in that string in the order they occur.



public class String_filter {
    public static long filterString(final String value) {
        return Long.parseLong(value.replaceAll("[a-z]","")); // complete this function :)
    }
}

//    public static long filterString(final String value) {
//        String str = value;
//        str = str.replaceAll("[a-z]","");
//        Long a = Long.parseLong(str);
//        return a; // complete this function :)
//    }
//}