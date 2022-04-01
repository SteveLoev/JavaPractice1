package task._done.Test3;

import java.util.ArrayList;
import java.util.Arrays;

public class q27 {

    public static void main(String[] args) {

        String [] cities ={"Boston","Houston","Austin","Lincoln","Tulsa"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(cities));

        System.out.println(list);//debug to see org list

        int a = list.size();  //5

        for (String str : list) {

            String rev= "";

            for(int i = str.length()-1; i>=0; i--){
                rev += str.charAt(i);
            }

            list.set(--a,rev);  // at first word, make 5 a 4 and put reversed first word there
                                    //[Boston, Houston, Austin, Lincoln, notsoB]
            System.out.println(list); //debug
        }
        System.out.println(list);
    }
}
//[Boston, Houston, nitsuA, notsuoH, notsoB]