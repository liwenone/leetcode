class Solution {
  public String convert(String s, int numRows) {
    if (numRows < 2) return s;

    StringBuilder[] builders = new StringBuilder[numRows];
    for (int i = 0; i < numRows; i++) {
      builders[i] = new StringBuilder();
    }

    char[] charArr = s.toCharArray();
    int row = 0, flag = -1;
    for (int i = 0; i < charArr.length; i++) {
      builders[row].append(charArr[i]);

      if (row == 0 || row == numRows - 1) flag = -flag;
      row += flag;
    }

    StringBuilder res = new StringBuilder();
    for (int i = 0; i < numRows; i++) {
      res.append(builders[i]);
    }

    return res.toString();
  }
}