class Solution {
    public List<List<Integer>> combinationSum(int[] c, int t) {
        List<List<Integer>> r = new ArrayList<>();
        f(c, t, 0, new ArrayList<>(), r);
        return r;
    }
    void f(int[] c, int t, int i, List<Integer> a, List<List<Integer>> r) {
        if (t < 0) return;
        if (t == 0) { r.add(new ArrayList<>(a)); return; }
        for (int j = i; j < c.length; j++) {
            a.add(c[j]);
            f(c, t - c[j], j, a, r);
            a.remove(a.size() - 1);
        }
    }
}
