package com.kyun8;



public class GreenGlassDoor {
    public static void main(String[] args) {
        String s = "chalenge";
        String[] arr = s.split("");
        boolean b = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(arr[i + 1])) {
                b = true;
                break;
            }
        }
        System.out.println(b);
    }
}
