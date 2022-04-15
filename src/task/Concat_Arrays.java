package task;
import utilities.ArraysUtility;

import java.util.Arrays;

public class Concat_Arrays {

    public static void main(String[] args) {
            int[] arr1 = {10,20,30};
            int[] arr2 = {40,50,60};

            int[] arr3 = merge(arr1,arr2);

        System.out.println(Arrays.toString(arr3));

    }

    public static int[] merge(int[] arr1, int[] arr2){
        //implement using addElements method
        int[] result = {};

        //will go thru each array separately and add items to the new array, in order
        for (int each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;

    }
}
