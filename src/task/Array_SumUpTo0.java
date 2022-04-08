package task;


import java.util.Arrays;

public class Array_SumUpTo0 {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(4)));;
    }
    /*
    Write a function:
        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
        The function can return any such array.
        For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
        For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */

    /*
    all this does is just lists consequtive integers from 0 to whatever number is given
    and for the last element it puts a negative of the sum of all those integers.
    for that, we need a tracking variable "sum"
    (there are many possible correct answers using various negative integers)
     */
    public static int[] solution(int N) {

        //local int array with the size of the passed integer
        int[] result = new int[N];

        //accumulating variable
        int sum = 0;

        //go thru each element and just assign whatever the iteration variable is
        //except the last element of the array
        for (int i = 0; i < N - 1; i++) {

            result[i] = i;

            //update our accumulating variable
            sum += i;
        }

        //in the last index of the returned array, put negative of the sum
        result[N - 1] = -sum;

        return result;
    }


}
