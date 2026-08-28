class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int tmp = target - numbers[i];
            if (res.containsKey(tmp)) {
                return new int[] {res.get(tmp), i + 1};
            }
            res.put(numbers[i], i + 1);
        }
        return new int[0];
    }
}
