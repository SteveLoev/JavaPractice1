package task._done;

import java.util.*;

public class Map_SortByValue {

    public static void main(String[] args) {

        //create our data structure (word counts in imaginary web site)
        Map<String, Integer> wordCounts = new HashMap<>();
        wordCounts.put("USA", 100);
        wordCounts.put("jobs", 200);
        wordCounts.put("software", 50);
        wordCounts.put("A",100500);
        wordCounts.put("technology", 70);
        wordCounts.put("opportunity", 200);

        /**
         * RETURNS {software=50, technology=70, USA=100, jobs=200, opportunity=200, A=100500}
         */
        //System.out.println(sortByValue(wordCounts));

        System.out.println(sortWithTree(wordCounts));
        /**
         * returns {USA=100, jobs=200, opportunity=200, software=50, technology=70}
         */
    }
    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {

        //create list of map entries so we can call sort method on it
        /**
         * A map entry (key-value pair). The Map.entrySet method returns a collection-view of the map
         */
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());//get key/value of map
//LIST OF ARRAYS
        /**
         * Returns a comparator.
         * A comparator interface is used to order the objects of user-defined classes.
         * A comparator object is capable of comparing two objects of the same class
         * that compares Map.Entry in natural order on value.
         *
         * The returned comparator is serializable and throws NullPointerException
         * when comparing an entry with null values.
         */
        list.sort(Map.Entry.comparingByValue());

        //reassign passed param to an empty map
        Map map1 = new LinkedHashMap<>();

        //now populate this empty map with key/value pairs from the list we created above
        for (Map.Entry<String, Integer> each : list) {
            map1.put(each.getKey(), each.getValue());
        }

        return map1;

    }

    /**
     * TREE MAP WILL SORT KEYS, NOT VALUES!
     * case-sensitive
     * @param map
     * @return
     */

    public static Map<String, Integer> sortWithTree(Map<String, Integer> map){

        //cannot traverse map with a for so need to drop it into a list
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());//get key/value of map
//LIST OF ARRAYS

        //Map map2 = new TreeMap<>();

        /**
         * to make sort on keys case-insensitive
         */
        Map<String, Integer> map2 = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, Integer> each : list) {
            map2.put(each.getKey(), each.getValue());
        }
        return map2;

    }
}
