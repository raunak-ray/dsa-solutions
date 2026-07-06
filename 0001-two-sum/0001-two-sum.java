class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i<nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i<nums.length; i++) {
            int toFind = target - nums[i];

            if (map.containsKey(toFind) && map.get(toFind) != i)
                return new int[]{i, map.get(toFind)};
        }

        return new int[]{};
    }
}