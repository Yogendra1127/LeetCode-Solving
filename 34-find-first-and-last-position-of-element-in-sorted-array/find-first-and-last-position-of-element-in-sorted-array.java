class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstOccurrence = findFirst(nums,target);
        int lastOccurrence = findLast(nums, target);
        return new int[]{firstOccurrence, lastOccurrence};
    }

    static int findFirst(int[] nums, int target){
        int st = 0;
        int end = nums.length-1;
        int fo = -1;
            
        while(st<=end){
            int mid = (st + end)/2;
            if(nums[mid] == target){
                fo = mid;
                end = mid-1;
            }
            else if(target<nums[mid]){
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return fo;
    }

    static int findLast(int[] nums, int target){
        int st = 0;
        int end = nums.length-1;
        int lo = -1;

        while(st<=end){
            int mid = (st + end)/2;

            if(nums[mid] == target){
                lo = mid;
                st = mid+1;
            }
            else if(target < nums[mid]){
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return lo;
    }
}