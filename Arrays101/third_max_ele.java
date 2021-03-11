class Solution {
    public int thirdMax(int[] nums) {

        Set<Integer> hs = new HashSet<>();
        for(int ele:nums){
            hs.add(ele);
            if(hs.size() > 3){
                hs.remove(Collections.min(hs));
            }
        }
        if(hs.size() ==3){
            return Collections.min(hs);
        }
        return Collections.max(hs);
    }
}
