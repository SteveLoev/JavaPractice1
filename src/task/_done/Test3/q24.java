package task._done.Test3;

import java.util.ArrayList;
import java.util.Arrays;

public class q24 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(2,97,2,56,46,73,6,2,3,7));
                                //        x        x       x
        String s = "";

        for (int i = 0; i < numbers.size(); i++) {
            if(i==2||i==5||i==9){
                continue;
            }
            if(numbers.get(i)==2||numbers.get(i)%3==0){
                s+="1";
            }else{
                s+="0";
            }
        }
        // 1. s += "1"; 2. s += "0", ="10"; and so on
        System.out.println(s);
        //1000111
    }
}
