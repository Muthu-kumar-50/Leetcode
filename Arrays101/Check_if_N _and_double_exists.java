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

// Time complexity O(n^2) and Space Complexity O(n)

class Solution {
    public boolean checkIfExist(int[] arr) {
      for(int i=0; i<arr.length; i++){
          int target = arr[i];
          for(int j=i+1; j<arr.length; j++){
              if(target == 2*arr[j] ||(arr[j]%2==0  && target == arr[j]/2)){
                  return true;
              }
          }
      }
    return false;
    }
}
