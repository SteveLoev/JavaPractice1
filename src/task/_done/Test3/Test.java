package task._done.Test3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        //add method is for 1 element? yes, give index and integer value or just value and it will tack at end

        ArrayList<Integer> list1 = new ArrayList<>();


        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Python","Python","Ruby","JavaScript","C#","C++","Java","Java"));


        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        /*
        method1();
        method2("The sun set quickly and created a shadow");
        method3(50);

         */
        //System.out.println(method5("apple"));
       // System.out.println(method6("mark"));
        //String str = method7("on the weekend",20);
        //System.out.println(str);
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] a = new int[size];
        int i = 0;
        while (i<size){
            a[i++] = input.nextInt();
        }
        method8(a);


    }
    public static void method8(int [] arr){
        for(int n: arr){
            if(n%4==0){
                continue;
            }
            System.out.print(n);
        }
    }







    public static String method7(String str,int s){
        str = str.substring(6);
        if(s<10){
            str = str.substring(8);
        }else{
            if(str.length()>s){
                str = "weekday";
            }else if(s>10||s== -10){
                str = str.substring(5);
            }
        }
        return str;
    }





    public static boolean method5(String str){
        boolean check = true;
        if(str.isEmpty()){
            check = false;
        }

        check = str.substring(0,1).equals("a")? check: false;
        return check;
    }

    public static int [] method6(String str){
        int [] arr = new int[str.length()];
        int n = 10;
        for (int i = 0; i < arr.length; i++) {
            if(n==20||n==50||n==70){
                continue;
            }
            arr[i]=n;
            n *= 10;
        }
        return arr;
    }


    public static void method1(){
        int n = -5;
        for (int i = 1; i < 5; i++) {
            n *= i;
        }
        System.out.println(n);
    }
    public static void method2(String s){
        String a = s.substring(10);
        if(a.length()>s.length()){
            System.out.println(a);
        } else {
            System.out.println(s);
        }
    }
    public static String method3(int num){
        if(num<0){
            return "Less than 0";
        }else if(num < 50){
            return "Less than 50";
        }else if(num < 100){
            return "Less than 100";
        }else{
            return "other";
        }
    }
}
