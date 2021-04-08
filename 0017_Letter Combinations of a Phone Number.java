import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        String[] dict = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        int total = 1;
        String[] tmpArr = new String[digits.length()];
        for (int i = 0; i < tmpArr.length; i++) {
            tmpArr[i] = dict[digits.charAt(i) - '2'];
            total *= tmpArr[i].length();
        }

        for (int i = 0; i < total; i++) {
            int counter = 1;
            int acc = 1;
            StringBuilder sb = new StringBuilder();
            for (int j = tmpArr.length - 1; j >= 0; j--) {
                acc *= tmpArr[j].length();

                int pos = (i % acc) / counter;
                sb.append(tmpArr[j].charAt(pos));

                counter *= tmpArr[j].length();
            }
            result.add(sb.reverse().toString());
        }

        return result;
    }
}