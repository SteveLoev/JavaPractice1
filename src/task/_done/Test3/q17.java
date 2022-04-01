package task._done.Test3;
import java.util.Scanner;

public class q17 {

    /*
    user input: true, 6, false, four
    output: 31
     */

    public static int action(){
        return 0;
    }
    public static int action(int i){
        return i*2;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        total += action(input.nextBoolean()); //1. total = 10
        total += action(input.nextInt()); //2. 10 += 6*2, =22
        total += action(); //3. no input, calls itself. 22 += 0;
        total += action(input.next());  //4. input is string, word "false" length is 5; total += 5, = 27
        total += action(input.next());  //5. input is "four", =4, means total += 4, = 31

        System.out.println(total);
    }

    public static int action(String s){
        return s.length();
    }
    public static int action(boolean b){    //true
        if(!b){
            return 5;
        }else{
            return 10;
        }
    }
}
