package task;

import java.util.ArrayList;

public class Sort_ArrayList_Desc {
    public static void main(String[] args) {
        ArrayList< Integer > arraylist = new ArrayList < Integer > ();

        arraylist.add(14);
        arraylist.add(2);
        arraylist.add(100);
        arraylist.add(25);

        sortDesc(arraylist);

        //print out each elem line by line; OR can use simple sout(arrayList) to print on one line
        for (int i: arraylist) {
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> sortDesc (ArrayList<Integer> arraylist) {

        //create internal copy of the passed array
        ArrayList<Integer> loopList = arraylist;
        //outer loop going thru each element of the arrayList
        for (int i = 0; i < loopList.size(); i++) {

            /**
             * comparing this particular iteration to "ALL" elements of the array
             * if it's smaller, then swap them
             */
            for (int j = loopList.size() - 1; j > i; j--) {
                if (loopList.get(i) < loopList.get(j)) {

                    int tmp = loopList.get(i);
                    loopList.set(i, loopList.get(j));
                    loopList.set(j, tmp);
                }
            }
        }
        return loopList;
    }
}
