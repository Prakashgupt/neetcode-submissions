class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> seen = new HashSet<>();

        for (int i = 0; i < nums.length-2; i++) {
           
           if(i>0 && nums[i]==nums[i-1])
            {continue;}
            int right = nums.length - 1;
            int left = i + 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    List<Integer> trip = List.of(nums[i], nums[left], nums[right]);
                    seen.add(trip); 
                   left++;
                    right--;
                }
            }
        }
        res.addAll(seen);
        return res;
    }
}
