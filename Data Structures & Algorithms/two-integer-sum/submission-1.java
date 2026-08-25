class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(res.containsKey(difference)) {
                return new int[]{res.get(difference), i};
            }
            res.put(nums[i], i);
        }
        return new int[]{};
    }
}
