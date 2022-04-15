package task._done;

public class SumOfDigits {

    public static void main(String[] args) {

        String str = "uoj1luoer89";

        System.out.println(digitSum(str));
    }

    public static int digitSum(String str){

        int sum = 0;

        char[] chars = str.toCharArray();

        for (char each : chars) {

            if(Character.isDigit(each))
                sum += Integer.parseInt(""+ each); //need to parse otherwise it will add ASCII value
        }
        return sum;


    }
}
