package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveAhmed {


    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed","John", "Eric", "Ahmed"));

        System.out.println(names);

        removeAhmed(names);

        System.out.println(names);

    }

    public static List<String> removeAhmed(List<String> names) {

        //will use removeAll method of the ArrayList class
        names.removeAll(Arrays.asList("Ahmed"));

        return names;
    }
}
