class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        // Map to store: Key = number, Value = index
        Map<Integer, Integer> seen = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the required pair number has already been seen
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            
            // Otherwise, store the current number and its index
            seen.put(nums[i], i);
        }
        
        // Fallback (guaranteed not to be reached per problem constraints)
        throw new IllegalArgumentException("No two sum solution");
    }
}