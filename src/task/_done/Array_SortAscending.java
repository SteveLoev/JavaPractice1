package task._done;

import java.util.Arrays;

public class Array_SortAscending {

    public static void main(String[] args) {
        int[] nums = {10,5,-2,17,0};
        System.out.println("unsorted array is "+Arrays.toString(nums));
        System.out.println("sorted array is   " + Arrays.toString(sortA(nums)));


    }

    public static int[] sortA (int[] arr){

        //create local copy of passed array
        int[] result = arr.clone();

        //temp variable for value swap
        int temp;

        /*
        go through each index of array except the last one.
        We will compare each element to the next and swap if necessary;
        that means we don't need include the last element since there is nothing
        to compare it to.
        */
        for(int i = 0; i < result.length-1; i++){

            /*
            nested for loop, at each iteration of the outer loop,
            it will go through each arr element, compare it to the next;
            if next element is smaller, they will be swapped and
            Since we are iterating through every element at the every pass of the outer loop,
            the smaller elements will wind up in front of the array (bubble up)
            */
            for(int j = 0; j<result.length-1; j++) {

              if (result[j] > result[j+1]) {

                  temp = result[j];

                  result[j] = result[j+1];

                  result[j+1] = temp;

              }
          }
        }
        return result;
    }
}
