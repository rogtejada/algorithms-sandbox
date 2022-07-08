package numeric.palindrome;

public class NumericPalindrome {

    public boolean isPalindrome(int x) {
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
}
