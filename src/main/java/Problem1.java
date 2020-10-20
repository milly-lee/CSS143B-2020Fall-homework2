public class Problem1 {

    /*
    *looping through each number in the list
    * depending on where the number should end up
    * it will either swap to the front or to the back
    * keep track of lowest index (int low)
    * keep track of highest index (int high)
     */

    public static void colorSort(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        for(int i = 0; i < high + 1; i++){
            int val = nums[i];
            if(val == 0){
                // num needs to go in front
                nums[i] = nums[low];
                nums[low] = val;
                low++; //adjust the low num
            }

            if(val == 1){
            // num needs to go in middle
            }

            if(val == 2){
                //num needs to go at end
                nums[i] = nums[high];
                nums[high] = val;
                high--; // moves to the left
                i--; //don't move val over
            }
        }
    }
}
