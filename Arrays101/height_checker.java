class Solution {
    public int heightChecker(int[] heights) {
       int[] copy = heights.clone();
       int count =0;
       Arrays.sort(copy);
       for(int i=0;i<heights.length;i++){
           if(heights[i] != copy[i]){
               count++;
           }
       }
           return count;
       }
    }
