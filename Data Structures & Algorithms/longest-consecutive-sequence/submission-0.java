class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        int cnt=1;
        if(nums.length<=1)return nums.length;
        int maxcnt = Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]-nums[i]==1)cnt++;
            if(nums[i+1]-nums[i]>1)cnt=1;
            maxcnt=Math.max(maxcnt,cnt);
        }
        return maxcnt;
    }
}
