public class searchInsert {
    public int SearchInsert(int[] nums, int target) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
//                return i;
                j = i;
            }
            if (nums[i] < target) {
//                return i+1;
                j = i + 1;
            }
        }
        return j;
    }
}
