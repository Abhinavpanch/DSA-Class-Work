import java.util.*;

class Solution {
    private void backtrack(List<List<Integer>> ans, List<Integer> temp, int start, int n, int k) {
        
        if (temp.size() == k) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i <= n; i++) {
            temp.add(i);                    
            backtrack(ans, temp, i + 1, n, k); 
            temp.remove(temp.size() - 1);    
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), 1, n, k);
        return ans;
    }
}
