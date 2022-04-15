package task._done;

import java.util.Scanner;
/*
given 3 integers, is it possible to erase at most one digit from first integer
so that the sum of first and second equals third


 */
public class JavaTask {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number");
        String firstnum = s.next();
        System.out.println("Enter second number");
        String secondnum = s.next();
        System.out.println("Enter third number");
        String thirdnum = s.next();
        s.close();

        System.out.println("If it's possible: " + isPossible(firstnum, secondnum, thirdnum));
    }

    static boolean isPossible(String n1, String n2, String n3){

        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        int num3 = Integer.parseInt(n3);
 /*
        if (num1+num2==num3) return true;
        :: NEED TO ERASE 1 NUMBER, THIS RETURNS TRUE WITHOUT ERASING
*/
        for (int i = 0; i < n1.length(); i++) {
            String number = n1.substring(0,i)+n1.substring(i+1);
            if (number.charAt(0)=='0')continue;
            int temp=Integer.parseInt(number);
            if (temp+num2==num3) return true;
        }

        return false;
    }
}
