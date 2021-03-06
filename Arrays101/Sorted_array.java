class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        int p1 = 0;int p2=0;
        
        int[] dup = new int[m+n];
        
        for(int i=0; i < m+n; i++){

            if (n==0){return;}
            
            if (p1 < m && p2 <n && nums1[p1] < nums2[p2] || p1<m && p2>=n){
                dup[i] = nums1[p1];    
                p1++;
            }
            else{
                dup[i] = nums2[p2];
                p2++;
            }
        }
        for(int j=0; j<dup.length; j++){
            nums1[j] = dup[j];    
        }       
        for (int k = 0; k< dup.length; k++){
            System.out.println(dup[k]);
        }
    }
}
