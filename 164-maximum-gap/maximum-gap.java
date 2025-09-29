class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;

        if(nums == null || nums.length<2){
            return 0;
        }

        Arrays.sort(nums);

        int maxG = nums[1] - nums[0];

        for(int i=2 ; i<n ; i++){
            maxG = Math.max(maxG,nums[i] - nums[i-1]);
        }
        return maxG;
    }
}