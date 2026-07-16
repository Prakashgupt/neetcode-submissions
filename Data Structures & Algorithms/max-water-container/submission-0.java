class Solution {
    public int maxArea(int[] heights) {
        

        int left=0,right=heights.length-1;

        int maxres=0;
        while(left<right)
        { int minbound = Math.min(heights[left],heights[right]);

            int currarea= minbound*(right-left);

            if(heights[left]<=heights[right])
            {
             left++;
            }
            else{
                right--;
            }
             maxres=Math.max(currarea,maxres);
        }  
         return maxres;
    }
}
