class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
        for (int j=1;j<nums.length;j++){
            if(nums[i] !=nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        for (int k : nums){
            System.out.println(k);
        }
    return i+1;
    }
    
}
