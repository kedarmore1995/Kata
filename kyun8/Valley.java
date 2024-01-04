package com.kyun8;
import java.util.Arrays;

// How Green is my Valley?
//Input : an array of integers.
//
//        Output : this array, but sorted in such a way that there are two wings:
//
//        the left wing with numbers decreasing,
//
//        the right wing with numbers increasing.
//
//        the two wings have the same length. If the length of the array is odd the wings are around the bottom, if the length is even the bottom is considered to be part of the right wing.
//
//        each integer l of the left wing must be greater or equal to its counterpart r in the right wing, the difference l - r being as small as possible. In other words the right wing must be nearly as steep as the left wing.
//
//        The function is make_valley or makeValley or make-valley.
//
//        a = [79, 35, 54, 19, 35, 25]
//        make_valley(a) --> [79, 35, 25, *19*, 35, 54]
//        The bottom is 19, left wing is [79, 35, 25], right wing is [*19*, 35, 54].
//        79..................54
//        35..........35
//        25.
//        ..19




public class Valley {

    public static int[] makeValley(int[] arr) {
        // your code
        Arrays.sort(arr);
        int [] newArr = new int[arr.length];
        int j = arr.length;
        if(arr.length %2 ==0){
            for (int i = 0; i<arr.length/2; i++) {
                newArr[i] = arr[j-1];
                j=j-2;
            }
            int n = arr.length;
            for (int i = arr.length-1; i>= arr.length/2 ; i--){
                newArr[i]=arr[n-2];
                n = n-2;
            }
        }else{
            for (int i = 0; i<=arr.length/2; i++) {
                newArr[i] = arr[j-1];
                j=j-2;
            }
            int n = arr.length;
            for (int i = arr.length-1; i>arr.length/2 ; i--){
                newArr[i]=arr[n-2];
                n = n-2;
            }
        }return newArr;
    }
}