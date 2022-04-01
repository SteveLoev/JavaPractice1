package _done;

import java.util.Arrays;

public class CompareStrings {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "cab";
        String str3 = "abb";

        System.out.println(compare(str1,str2));
        System.out.println(compare(str2,str3));


    }
    public static boolean compare(String str1,String str2){


        String[] arr1 = str1.split("");
        Arrays.sort(arr1);

        String[] arr2 = str2.split("");
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){

            return true;
        }else
        {
            return false;
        }



    }
}
