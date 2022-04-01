package task;

public class Array_FindMinimum {

    public static void main(String[] args) {

        int[] nums = {5,10,-2,0,17};

        System.out.println(FindMin(nums));

    }

    public static int FindMin(int[] arr){

        int min = arr[0];

        for (int each : arr) {
            if(each<min)
                min = each;
        }
        return min;


    }
}
