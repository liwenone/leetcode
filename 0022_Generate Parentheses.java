import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateAll(new char[2 * n], result, 0, 0);
        return result;
    }


    public void generateAll(char[] charArr, List<String> result, int pos, int balance) {
        if (balance < 0) return;

        if (pos == charArr.length) {
            if (balance == 0) {
                result.add(new String(charArr));
            }
            return;
        }

        charArr[pos] = '(';
        generateAll(charArr, result, pos + 1, balance + 1);
        charArr[pos] = ')';
        generateAll(charArr, result, pos + 1, balance - 1);
    }
}
