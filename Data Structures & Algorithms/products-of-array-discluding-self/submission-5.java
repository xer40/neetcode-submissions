class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            if (i == 0 && j == nums.length - 1) {
                prefix[i] = nums[i];
                postfix[j] = nums[j];
            } else {
                prefix[i] = nums[i] * prefix[i - 1];
                postfix[j] = nums[j] * postfix[j + 1];
            }
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[i] = postfix[i + 1];
            } else if (i == nums.length - 1) {
                result[i] = prefix[i - 1];
            } else {
                result[i] = prefix[i - 1] * postfix[i + 1];
            }
        }
        return result;
    }
}
