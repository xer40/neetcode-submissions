class Solution {
    public int maxArea(int[] heights) {
        int max = 0, i = 0, j = heights.length - 1;
        while (i < j) {
            if (((j - i) * Math.min(heights[i], heights[j])) > max) {
                max = ((j - i) * Math.min(heights[i], heights[j]));
            }
            if (heights[i] >= heights[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }
}
