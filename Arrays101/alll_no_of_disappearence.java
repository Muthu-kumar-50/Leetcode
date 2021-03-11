class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        Set<Integer> mark = new HashSet<Integer>();
        
        for(int i: nums){
            mark.add(i);
        }
        
        for(int j =1; j<=nums.length;j++){
            if(!mark.contains(j)){
                result.add(j);
            }
        }
        return result;
    }
}
