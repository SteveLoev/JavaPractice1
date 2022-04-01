package task;

public class FindMax {

    public static void main(String[] args) {

        int[] nums = {1,16,2,7,5};

        System.out.println("max value is "+ max(nums));


    }
    public static int max(int[] arr){

        int maxElem = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxElem)
                maxElem = arr[i];
        }

        return maxElem;
    }
}
