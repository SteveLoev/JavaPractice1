package task._done;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort_ArrayList_Asc {
    public static void main(String[] args) {

        //create our data structure
        ArrayList<Integer> arraylist1 = new ArrayList<>();

        arraylist1.add(25);
        arraylist1.add(100);
        arraylist1.add(14);
        arraylist1.add(2);

        //call sorting function inside print statement
        System.out.println(sortAsc(arraylist1));

    }
    public static ArrayList<Integer> sortAsc (ArrayList<Integer> arraylist) {

        //create internal copy of the passed array
        ArrayList<Integer> loopList = arraylist;

        //outer loop going thru each element of the arrayList
        for (int i = 0; i < loopList.size(); i++) {

        /**
                 * comparing this particular iteration to "ALL" elements of the array
                 * if it's larger, then swap them
                 */


                for (int j = loopList.size() - 1; j > i; j--) {
                    if (loopList.get(i) > loopList.get(j)) {

                        int tmp = loopList.get(i);
                        loopList.set(i, loopList.get(j));
                        loopList.set(j, tmp);

                    }

                }



        }
        return loopList;
    }

}
