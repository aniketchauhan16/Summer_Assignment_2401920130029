package Week_2.Day_4;

import java.util.ArrayList;
import java.util.List;

public class generate_paranthesis {
        void generate(List<String> ans, String s, int open, int close, int n) {
        if (open == n && close == n) {
            ans.add(s);
            return;
        }
        if (open > close)
            generate(ans, s + ")", open, close + 1, n);

        if (open < n)
            generate(ans, s + "(", open + 1, close, n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(ans, "", 0, 0, n);
        return ans;
    }
}
