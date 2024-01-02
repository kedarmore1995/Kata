package com.kyun8;

public class TwoDecimalPlaces {

    public static void main(String[] args) {
        String s = "1234.4321";
         String [] arr =  s.split("[.]");
         s = ( arr[0]+"."+arr[1].substring(0,2));
         double d = Double.parseDouble(s);
        System.out.println(d);
    }
}
