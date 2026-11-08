class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] answer = new int[nums.length];
        int at = 0;
        for (int x : nums) {
            if (x < pivot) {
                answer[at++] = x;
            }
        }
        for (int x : nums) {
            if (x == pivot) {
                answer[at++] = x;
            }
        }
        for (int x : nums) {
            if (x > pivot) {
                answer[at++] = x;
            }
        }
        return answer;
    }
}
