// Time complexity O(n) and Space Complexity O(n)
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> hs = new HashSet<>();
        for(int i: arr){
            if(hs.contains(2*i) || (i%2==0 && hs.contains(i/2)))
               {
                return true;
            }
            hs.add(i);
        }
        return false;
    }
}
