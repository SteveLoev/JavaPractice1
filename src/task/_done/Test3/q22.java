package task._done.Test3;

import java.util.ArrayList;

public class q22 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.remove(nums.size()-1); //index 0, it had 4 in it, remove. Now 0
        nums.add(2); //now [0]=2
        nums.add(10);  // [1] = 10;
        nums.add(0,6);  // make [0] = 6; and shift contents. [1] = 2, [2] = 10
        nums.remove(1);  // 6,10
        nums.add(-7);  // 6,10,-7
        nums.add(2,2); // 6,10,2,-7
        System.out.println(nums);
    }
}
//output: [6,10,2,-7]