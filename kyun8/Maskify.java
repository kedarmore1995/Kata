package com.kyun8;

//Credit card mas
//DESCRIPTION:
//        Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
//
//        Your task is to write a function maskify, which changes all but the last four characters into '#'.
//
//        Examples (input --> output):
//        "4556364607935616" --> "############5616"
//        "64607935616" -->      "#######5616"
//        "1" -->                "1"
//        "" -->                 ""
public class Maskify {
    public static String maskify(String str) {
        String s = str.substring(str.length() - 4, str.length());
        str = str.substring(0, str.length()-4);
        str = str.replaceAll("[\\w|\\W ]","#");
        str = str + s;
        System.out.println(str);
        return s;
    }

    public static void main(String[] args) {
        maskify("Nananananananananananananananana Batman!");
    }
}