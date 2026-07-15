class Solution {
    public int findMin(int[] nums) {
         
        int i=0,j=nums.length-1;
        if(nums.length==1)return nums[0];
   
        while(i<j)
        {
               
         int mid = (j+i)/2;
         //if(mid>0&&mid<nums.length-1&&nums[mid]<nums[mid-1]&&nums[mid]<nums[mid+1]) return nums[mid];
         if(nums[mid]>nums[j])
         {
            i=mid+1;
         }else{
           j = mid;
         }


        }
        return nums[i];
    }
}
