import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder string = new StringBuilder();
        genPara(result,string, 0, 0, n);
        return result;
    }

    private void genPara(List<String> result, StringBuilder current, int open, int close, int n) {
        
        if (current.length() == n * 2) {
            result.add(current.toString());
            return;
        }

        
        if (open < n) {
            current.append("(");
            genPara(result, current, open + 1, close, n);
            current.deleteCharAt(current.length() - 1); 
        }

        
        if (close < open) {
            current.append(")");
            genPara(result, current, open, close + 1, n);
            current.deleteCharAt(current.length() - 1); 
        }
    }
}
        
