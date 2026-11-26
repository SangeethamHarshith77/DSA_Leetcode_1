
import java.util.*;

class findDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for(int i = 1; i <= nums.length; i++) {

            boolean found = false;

            for(int j = 0; j < nums.length; j++) {

                if(nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if(found == false) {
                result.add(i);
            }
        }

        return result;
    }
}
