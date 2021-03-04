class Solution {
    int digit(int num){
       int len = 0;
        while (num >0){
            num = num/10;
            len++;
        }
        return len;
    }
    
    public int findNumbers(int[] nums) {
        int count =0;
       for (int i : nums){
          int len = digit(i);
          if (len%2 == 0){
               count++;
          }
       }
    return count;
    }
}
