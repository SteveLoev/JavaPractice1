package _done.Test4;

import java.util.Arrays;

public class groupQuiz {

    public static void main(String[] args) {

        String input = "DC501GCCCA098911";
        String result = sortLettersNumbers(input);
        System.out.println(result);

    }
    public static String sortLettersNumbers(String str){

        String temp = "";

        for (int i = 0; i < str.length(); i++) {

            temp += "" + str.charAt(i);

            if (Character.isAlphabetic( str.charAt(i)) && i < str.length()-1){

                if (Character.isDigit(str.charAt(i+1))){
                    temp += ",";
                }

            }
            if (Character.isDigit( str.charAt(i)) && i < str.length()-1){

                if (Character.isAlphabetic(str.charAt(i+1))){
                    temp += ",";
                }

            }




        }
        String[] arr = temp.split(",");
        str = "";

        for (String each : arr){
            char[] chars = each.toCharArray();
            Arrays.sort(chars);

            for (char eachChar : chars){
                str += "" + eachChar;
            }
        }

        return str;

    }


}
