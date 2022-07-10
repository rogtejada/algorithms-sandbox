package numeric.palindrome;

public class NumericPalindrome {

    //converting to string
    public boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        }

        char[] chars = ("" + x).toCharArray();

        StringBuilder builder = new StringBuilder();
        for (int i = chars.length-1; i >= 0; i--) {
            builder.append(chars[i]);
        }

        long reversed = Long.parseLong(builder.toString());



        if(x == reversed) {
            return true;
        }

        return false;

    }


    //no data conversion - using mod, division and multiply
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNumber = 0;
        int temp = x;

        while(temp > 0) {
            reversedNumber = reversedNumber * 10 + temp%10;
            temp /= 10;
        }


        return reversedNumber == x;

    }
}
