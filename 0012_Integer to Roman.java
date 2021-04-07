class Solution {
    public String intToRoman(int num) {
        int[] arr = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] strArr = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0 && num > 0; i--) {
            int count = num / arr[i];

            if (count > 0) {
                sb.append(strArr[i].repeat(count));
                num = num - arr[i] * count;
            }
        }

        return sb.toString();
    }
}
