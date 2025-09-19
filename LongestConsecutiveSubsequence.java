class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
              set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
           if(!set.contains(nums[i]-1)){
            int current=nums[i]+1;
            while (set.contains(current)){
                current++;
            
            } int lastEl=current-1;
            ans=Math.max(ans,lastEl-nums[i]+1);            }

            }  
    return ans;
    }
}
