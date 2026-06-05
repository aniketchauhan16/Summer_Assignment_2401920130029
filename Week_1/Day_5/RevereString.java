package Week_1.Day_5;

public class RevereString {
    public static void reverseString(char[] s) {
        int start = 0; int end = s.length - 1;
        reversetheString(s, start, end);
        System.out.println(new String(s));
    }

    public static void reversetheString(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }
        char x = s[start];
        s[start] = s[end];
        s[end] = x;
        reversetheString(s, start + 1, end - 1);
    }
    
}
