package task._done;

public class PasswordValidation {

    public static void main(String[] args) {

        String password = "P1ssw@ rd";

        /*method using ASCII ranges
                char[] chars = password.toCharArray();
        for (char each : chars) {
           if((each>32 && each<48) || (each>57 && each<65) || (each>90 && each <97))
                hasSpecial = true;

        }
        */

        System.out.println(strongRegExp(password));
        System.out.println(strong(password));


    }
    public static boolean strong(String password){

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if(Character.isUpperCase(each))
                countUpperCase++;
            else if (Character.isLowerCase(each))
                countLowerCase++;
            else if (Character.isDigit(each))
                countDigits++;
            else
                countSpecialChar++;
        }

        boolean hasUpper = countUpperCase > 0;
        boolean hasLower = countLowerCase > 0;
        boolean hasDigit = countDigits > 0;
        boolean hasSpecial = countSpecialChar > 0; //space will be counted as special char

        boolean strongPassword = password.length() >=6 && !password.contains(" ")
                && hasSpecial && hasDigit && hasLower && hasUpper;


        return strongPassword;
    }

    public static boolean strongRegExp(String password){
        //using .matches() method of String, it takes regExp as argument
        boolean hasSpecial = password.matches(".*[@?#!$].*");
        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasLower = password.matches(".*[a-z].*");
        boolean hasDigit = password.matches(".*[0-9].*");

        boolean strongPassword = password.length() >=6 && !password.contains(" ")
                && hasSpecial && hasDigit && hasLower && hasUpper;

        return strongPassword;

    }
}
/*
(need to compile this pattern
    String regex_pattern =
            "^(?=.*[0-9])" +
                    "(?=.*[a-z])" +
                    "(?=.*[A-Z])" +
                    "(?=.*[!@#&()–[{}]:;',?/*~$^+=<>])" +
                    ".{8,24}$";
    boolean a = regex_pattern.matches(".*"); //means any character "." (preceding) matched any number of times "*"
 */