class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       for(int i = 0 ; i<nums.length ; i++){
       for(int j = i +1 ; j < nums.length ; j++){
       if(nums[i] == nums[j]){

        int add = j - i;
        if ( add <= k){
    return true;
 }
       }    
        }
}
return false;
       } 
    }
