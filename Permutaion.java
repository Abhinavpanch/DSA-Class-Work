class Solution {
    public void Permi(List<List<Integer>> ans, List<Integer> temp, boolean[] used, int[] nums) {
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            temp.add(nums[i]);
            Permi(ans, temp, used, nums);
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Permi(ans, new ArrayList<>(), used, nums);
        return ans;
    }
}
