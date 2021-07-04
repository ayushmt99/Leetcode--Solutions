class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int c1=0,c2=0,nums1=-1,nums2=-1;
        for(int el : nums){
            if(el == nums1) c1++;
            else if(el == nums2) c2++;
            else if(c1==0){
                nums1=el;
                c1=1;
            }
            else if(c2==0){
                nums2 = el;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;c2=0;
        for(int el : nums){
            if(el==nums1) c1++;
            if(el == nums2) c2++;
        }
        if(c1>nums.length/3) li.add(nums1);
        if(nums1 == nums2){
            return li;
        }
        if(c2>nums.length/3) li.add(nums2);
        
        return li;
    }
}
