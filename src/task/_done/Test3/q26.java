package task._done.Test3;
import java.util.Scanner;
import java.util.ArrayList;

public class q26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

//input: 6 is for arr size,
// 4,1,8,-42,2,10

        int run = in.nextInt();

        while(run > 0){

            run--;
            switch (in.nextInt()){
                case 1:
                    nums.add(1);  // 2. put 1 in 0, go on to next case. put 50 in 1, break
                case 5:
                    nums.add(50);
                    break;
                case 4:
                    break;  //1. nothing added
                case 8:
                    nums.remove(0);   //3. remove 1 at 0
                    break;
                case 10:   // 6. match, go until there is break. this will put 0 into 1: [50,0,0,20000]
                case -1:
                case -42:
                    nums.add(1,0);     //4. put 0 in 1
                    break;
                case 55:
                    nums.add(105);
                    break;
                case 2:
                    nums.add(20_000);      //5. 50,0,20000
                    break;
                default:
                    nums.add(null);
            }
        }

        System.out.println(nums);
    }

}
