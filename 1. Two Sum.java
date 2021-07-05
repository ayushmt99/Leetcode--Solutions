class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int c=0;
        int[] a= new int[2];
        for (int i = 0; i < nums.length; i++) {
            c=target-nums[i];
            if(map.containsKey(c)){
                a[0] =map.get(c);
                a[1]=i;
                return a;
            }
            else{
                map.put(nums[i], i);
            }
        }
            return a;
    
    }
}
