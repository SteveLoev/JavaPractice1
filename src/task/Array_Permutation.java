package task;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Array_Permutation {

    public static void main(String[] args) {
        char[] chars = {'b', 'b', 'e'};
        printPermutation(chars);

    }
   /*
    Given an array of 3 characters print all permutation combinations from the given characters
    */

    public static void printPermutation(char[] ch) {
        //call permutation function on each element of the passed char array
        //this function will return a set for every char
        for (String s : permutation(ch)) {
            System.out.println(Arrays.toString(s.toCharArray()));
        }
    }

    public static Set<String> permutation(char[] ch) {
        //make a string out of the passed array
        String str = Arrays.toString(ch).replace(", ", "").replace("[", "").replace("]", "");

        /*
        create a set that will be returned, will add to this set in a for loop.
        linkedHasSet has no index, does not allow dups, and has no order
        it keeps insertion order
        */
        Set<String> set = new LinkedHashSet<>();

        /*
        if there is only one character in the passed array, the created string
        will consist of 1 letter so we can add it to the set right away and be done with it
        */
        if (str.length() == 1) {
            set.add(str);
        } else {
            //for every character of the created string
            for (int i = 0; i < str.length(); i++) {

                //build a new string taking substring preceding and following this char
                String otherChars = str.substring(0, i) + str.substring(i + 1);

                //split it into char array
                char[] ch2 = otherChars.toCharArray();

                //function calls itself on every char of the string
                // and thus we cover all possible outcomes
                for (String permutation : permutation(ch2)) {
                    set.add(str.charAt(i) + permutation);
                }
            }

        }

        return set;
    }

}
