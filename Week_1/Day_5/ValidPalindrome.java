package Week_1.Day_5;
public class ValidPalindrome {
     public boolean isPalindrome(String s) {
        s = s.replaceAll("\\p{Punct}","");           // removes punctuatuion from our code
        s = s.replaceAll("\\s", "");                // removes white space
        s = s.toLowerCase();                        // makes all letters in lowercase
             int i = 0;
              int n = s.length();
        while (i < n / 2) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
