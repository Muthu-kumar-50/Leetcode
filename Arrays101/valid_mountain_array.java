class Solution {
    public boolean validMountainArray(int[] arr) {
     int i =0;
     int len  = arr.length;
     if(len < 3) return false;
     //walk the array untill it increase
     while(i+1 < len && arr[i] < arr[i+1]){ i++;}
     // if i =0 or i = len-1 then return false
     if (i == 0 || i == len-1){ return false;}
     //walk the array untill decreases
     while(i+1 < len && arr[i] > arr[i+1]){ i++;}
     // if i ==len-1 return true
    
     return i == len-1;
    }
}
