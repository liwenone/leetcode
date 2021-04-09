import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public List<String> generateParenthesis(int n) {
        HashMap<Integer, List<String>> map = new HashMap<>();
        List<String> result = backTrace(map, n);
        return result;
    }

    public List<String> backTrace(HashMap<Integer, List<String>> map, int n) {
        List<String> list = map.get(n);
        if (list != null)
            return list;
        list = new ArrayList<>();

        if (n == 1)
            list.add("()");

        for (int i = 1; i <= n - 1; i++) {
            List<String> left = backTrace(map, i);
            List<String> right = backTrace(map, n - i);

            for (int j = 0; j < left.size(); j++) {
                for (int k = 0; k < right.size(); k++) {
                    String str = left.get(j) + right.get(k);
                    if (!list.contains(str))
                        list.add(str);
                }
            }

            if (i == n - 1) {
                for (int j = 0; j < left.size(); j++) {
                    String str = left.get(j);
                    if (!list.contains(str))
                        list.add("(" + str + ")");
                }
            }
        }

        map.put(n, list);

        return list;
    }
}
