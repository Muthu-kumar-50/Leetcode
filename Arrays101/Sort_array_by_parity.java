class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        
        int i=0;
        
        for(int j=0; j<A.length; j++){
            if(A[j] % 2 == 0){
                ans[i] = A[j];
                i++;
            }
        }
        
         for(int j=0; j<A.length; j++){
            if(A[j] % 2 == 1){
                ans[i] = A[j];
                i++;
            }
        }
        return ans;
    }
}
