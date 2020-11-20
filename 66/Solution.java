public class Solution {

    public int[] plusOne(int[] digits) {

        int n = digits.length;
        int i = n - 1;
        boolean flag = true;

        while(flag && i >= 0 && !(flag = false)) if(++digits[i--] == 10 && (flag = true)) digits[i + 1] = 0;

        if(flag) {
            int[] res = new int[n + 1];
            res[0] = 1;
            return res;
        } else return digits;
    
    }

}
