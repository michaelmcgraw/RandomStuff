public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // Your code here
        int[] index = new int[2];
        for (int i=0;i< nums.length;i++){
            for (int j=i+1;j< nums.length;j++){
                if (nums[i]+nums[j] == target){
                    index[0]=i;
                    index[1]=j;
                    return index;
                }
            }
        }
        return index;
    }
}
