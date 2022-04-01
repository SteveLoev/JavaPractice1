package task._done.Test3;
import java.util.Scanner;

public class Test2 {
    public static String method9(String one,String two,String three){
        return ""+middle(one)+middle(two)+middle(three);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = method9(scan.next(), scan.next(), scan.next());
        System.out.println(str);
    }


    public static char middle(String s){
        return s.charAt(s.length()/2);
    }
}
