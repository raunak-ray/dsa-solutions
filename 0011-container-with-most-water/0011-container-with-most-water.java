class Solution {
    public int maxArea(int[] height) {
        int l =  0, r = height.length - 1;

        int maxArea = 0;

        while (l <= r) {
            int width = r - l;
            int heightt = Math.min(height[l], height[r]);

            int area = width * heightt;

            maxArea = Math.max(maxArea, area);

            if (heightt == height[l]) l++;
            else r--;
        }

        return maxArea;
    }
}