package task._done.Exam;

import java.util.HashMap;
import java.util.Map;

public class simple {

    public static void main(String[] args) {
        Map<Character, String> connect = new HashMap<>();
        connect.put('a',"a");
        connect.put('c',"C");
        connect.put('z',null);
        connect.put('y',"yz");
        connect.put('y',connect.get('c'));


        System.out.println(connect.get('z')+ connect.get('y')+ connect.get('a'));


    }
}
