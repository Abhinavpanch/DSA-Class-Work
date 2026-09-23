class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        Permi(ans,new ArrayList<>(), used, nums);
        return ans;
    }

    public void Permi(List<List<Integer>> ans, List<Integer> temp, boolean[] used, int[] nums){
            if(temp.size()==nums.length){
                ans.add(new ArrayList<>(temp));
                return;
            }

            for(int i=0;i<nums.length;i++){
                if(used[i] || (i>0 && nums[i]==nums[i-1] && !used[i-1])) continue;

                used[i]=true;
                temp.add(nums[i]);
                Permi(ans, temp, used, nums);
                used[i]=false;
                temp.remove(temp.size()-1);
            }
    }
}
