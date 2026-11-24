
class Solution {
    public int countDominantElements(int[] nums) {

        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (i == 0 && n > 1) {
                if (nums[i] >= nums[i + 1]) {
                    count++;
                }
            }

            else if (i == n - 1 && n > 1) {
                if (nums[i] >= nums[i - 1]) {
                    count++;
                }
            }

            else if (n == 1) {
                count++;
            }

            else {
                if (2L * nums[i] >= (long) nums[i - 1] + nums[i + 1]) {
                    count++;
                }
            }
        }

        return count;
    }
}