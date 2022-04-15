package task;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_RemoveValues {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,500,50};

        //create a new array and call our function to populate it
        int[] arr2 = remove100plus(arr);

        System.out.println(Arrays.toString(arr2));
    }

    public static int[] remove100plus(int[] array){

        //making temp array list because it's flexible in adding/removing elements
        ArrayList<Integer> list = new ArrayList<>();

        /**
         * going thru each elem of passed array, if it's less than 100, we will add to new
         * array and then return to main (it doesn't have to be 100, can make it 500 or whatever)
         */
        for(int each: array){
            if( each < 100){
                list.add(each);
            }
        }

        //now create a new array from the list to pass to main function
        array = new int[list.size()];

        //use a for loop and go thru each element of list and assign to our new array
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;



    }
}
