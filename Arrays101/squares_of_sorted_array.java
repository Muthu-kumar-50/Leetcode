class Solution {
    public int[] sortedSquares(int[] nums) {
       int start = 0;int end = nums.length -1;int i = end;
        //base case num is empty
        if (nums == null){
            return null;
        }
        int[] ans = new int[nums.length];
        while (start <= end){
            int pow1 = nums[start] * nums[start];
            int pow2 = nums[end] * nums[end];
            
            if (pow1 > pow2){
                ans[i--] = pow1;
                start++;
            }
            else{
                ans[i--] = pow2;
                end--;
            }
        }
        return ans;
    }
}
