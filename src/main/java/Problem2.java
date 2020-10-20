public class Problem2 {

    /*
     *loop through all the number
     * everytime you see a number, check if it is a new number
     * if it is new, move it after the previous new number
     * if it is not new, skip the number
     * return index of last new number + 1(index + 1 = length)
     */

    public static int remove(int[] nums) {
        if(nums.length <= 1) {
         return nums.length;  //if there is 0 or one num on the list, it's already sorted
        }

        int low = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[low]){
                low++;
                nums[low] = nums[i];
            }
        }
        return low+1;

    }
}
