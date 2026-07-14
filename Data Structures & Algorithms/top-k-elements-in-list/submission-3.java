class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }

        List<Map.Entry<Integer,Integer>> queue = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
          queue.add(entry);

         
        }
        Collections.sort(queue, (a,b)->a.getValue()-b.getValue());
       
         int[] res = new int[k];
         int id =queue.size()-1;
        for(int i=0;i<k && id>=0;i++)
        { 
          res[i] = queue.get(id).getKey();
          id--;


        }
        return res;
    }
}
