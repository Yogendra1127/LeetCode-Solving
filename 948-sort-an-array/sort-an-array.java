class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        for(int i=0 ; i<n ; i++){
            int j=i-1;
            int key = nums[i];
            while(j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        return nums;
    }
}