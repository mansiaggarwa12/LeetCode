class Solution {
    boolean[] used;
    List<Integer> path;
    List<List<Integer>> ans;

    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        used = new boolean[nums.length];
        path = new ArrayList<>();
        ans = new ArrayList<>();

        backtrack(nums);

        return ans;
    }

    public void backtrack(int[] nums) {

        if (path.size() == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i])
                continue;

            // Skip duplicate choices at the same level
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;

            used[i] = true;
            path.add(nums[i]);

            backtrack(nums);

            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}