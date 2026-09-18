import java.util.*;

class Solution {

    void mergeSort(int[] nums, int[] index, int[] count,
                   int[] temp, int left, int right) {

        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(nums, index, count, temp, left, mid);
        mergeSort(nums, index, count, temp, mid + 1, right);

        merge(nums, index, count, temp, left, mid, right);
    }

    void merge(int[] nums, int[] index, int[] count,
               int[] temp, int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int k = left;

        int rightCount = 0;

        while (i <= mid && j <= right) {

            if (nums[index[i]] <= nums[index[j]]) {

                count[index[i]] += rightCount;
                temp[k++] = index[i++];

            } else {

                temp[k++] = index[j++];
                rightCount++;
            }
        }

        while (i <= mid) {

            count[index[i]] += rightCount;
            temp[k++] = index[i++];
        }

        while (j <= right) {

            temp[k++] = index[j++];
        }

        for (int a = left; a <= right; a++) {
            index[a] = temp[a];
        }
    }

    public List<Integer> countSmaller(int[] nums) {

        int n = nums.length;

        int[] index = new int[n];
        int[] count = new int[n];
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        mergeSort(nums, index, count, temp, 0, n - 1);

        List<Integer> ans = new ArrayList<>();

        for (int x : count) {
            ans.add(x);
        }

        return ans;
    }
}