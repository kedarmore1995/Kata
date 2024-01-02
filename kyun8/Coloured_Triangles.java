package com.kyun8;

import java.util.Objects;

public class Coloured_Triangles {

    public void pattern(String row){  // R R G R G B B

        String result = "";
//        if(row.length()==1){
//            result = row;
//        }
        for (int i = 0; i<row.length()-1; i++){
            if(Objects.equals(row.charAt(i),row.charAt(i+1))){
                result += row.charAt(i);
            }else if(!Objects.equals(row.charAt(i), row.charAt(i + 1))){
                result += row.replace("[RG]", "B");
            }else if(Objects.equals(row.charAt(i),row.charAt(i+1))){
                result +=row.replace("[BG]", "R");
            }else{
                result +=row.replace("[BR]", "G");
            }
            System.out.println(result);
        }
//        if (result.length()>1){
//            pattern(result);
//        }else {
//            System.out.println( result);
//        }
    }


    public static void main(String[] args) {
        Coloured_Triangles obj = new Coloured_Triangles();
            obj.pattern("RRGRGBB");
    }
}

