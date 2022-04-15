package task;


import java.util.Arrays;

public class Concat_Arrays {

    public static void main(String[] args) {
            int[] arr1 = {10,20,30};
            int[] arr2 = {40,50,60};

            int[] arr3 = merge(arr1,arr2);

        System.out.println(Arrays.toString(arr3));

    }

    public static int[] merge(int[] arr1, int[] arr2){

        //create a new temp array of the combined sizes of the passed arrays
        int[] result = new int[arr1.length + arr2.length];

        /**
         *         going to loop thru both arrays in succession so we need a counter value
         *         that we can use going from first array to the second one
         */
        int i = 0;

        //add elements from the first array to our new array
        for (int each : arr1) {
            result[i++] = each;
        }

        //now add elements from the second array to our new array, using persistent index of i
        for (int each : arr2) {
            result[i++] = each;
        }
        return result;

    }
}
