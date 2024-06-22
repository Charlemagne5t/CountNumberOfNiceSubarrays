public class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int start = 0;
        int res = 0;
        int count = 0;
        int leadZeroes = 1;
        for(int i = 0; i < n; i++) {
            if(count == 0 && ((nums[i] & 1) == 0)){
                leadZeroes++;
                start++;
            }else if((nums[i] & 1) == 1) {
                count++;
            }
            if(count == k) {
                res += leadZeroes;
            }
            if(count > k){
                leadZeroes = 1;
                if((nums[start] & 1) == 1){
                    count--;
                }
                start++;

                while (start < n && (nums[start] & 1) == 0) {
                    start++;
                    leadZeroes++;
                }
                res += leadZeroes;
            }
        }
//        if(count == k) {
//            res += leadZeroes + 1;
//        }

        return res;

    }
}
