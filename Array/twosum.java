class Solution {
    public int[] twoSum(int[] arr, int target) {
       
        for(int i=0;i<arr.length;i++){
             int j=i+1;
            if(arr[i]+arr[j]==target){
                return new int[]{i,j};
            }
            else (j<arr.length){
                j++;
            }
        }
        return new int[]{-1, -1};
    
}
}