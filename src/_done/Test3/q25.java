package _done.Test3;

import java.util.ArrayList;
import java.util.Arrays;

public class q25 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList
                ("during","storm","rain","fell","season","cloudy","safe"));

        ArrayList<Integer> lengths = new ArrayList<>();

        for (String word : words) {
            lengths.add(word.length());  //looks at each word in words and adds it's length to new array
        }
        System.out.println(lengths);
    }
}
// [6, 5, 4, 4, 6, 6, 4]