package Week_2.Day_4;

public class reverse_words {
       public String reverseWords(String s) {
        String[] words = s.split("\\s+"); 
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse(); 
            reversed.append(reversedWord).append(" "); 
        }
        return reversed.toString().trim();
    }
}
