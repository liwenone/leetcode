// class Solution {
//     public String intToRoman(int num) {
//         int[] arr = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
//         String[] strArr = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

//         StringBuilder sb = new StringBuilder();
//         for (int i = arr.length - 1; i >= 0 && num > 0; i--) {
//             int count = num / arr[i];

//             if (count > 0) {
//                 sb.append(strArr[i].repeat(count));
//                 num = num - arr[i] * count;
//             }
//         }

//         return sb.toString();
//     }
// }


class Solution {
    public String intToRoman(int num) {
        String d1[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String d2[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String d3[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String d4[] = {"", "M", "MM", "MMM"};

        StringBuilder sb = new StringBuilder();
        sb.append(d4[num / 1000]);
        sb.append(d3[num % 1000 / 100]);
        sb.append(d2[num % 100 / 10]);
        sb.append(d1[num % 10]);

        return sb.toString();
    }
}
