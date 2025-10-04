class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }

    public static void quickSort(int[] nums, int start , int end){
        if(start>=end) return;
        int pi = partition(nums,start,end);
        quickSort(nums,start,pi-1);
        quickSort(nums,pi+1,end);
    }
    public static int partition(int[] nums, int start , int end){
        int randomPivot = start + (int)(Math.random() * (end - start + 1));
        swap(nums, start, randomPivot);


        int pivot = nums[start];
        int count = 0;
        for(int i=start+1 ; i<=end ; i++){
            if(nums[i]<=pivot){
                count++;
            }
        }
        int pivotIndex = start +count;
        swap(nums,start , pivotIndex);

        int i=start , j=end;
        while(i<pivotIndex && j>pivotIndex){
            while(nums[i] <= pivot) i++;
            while(nums[j] > pivot) j--;
            if(i<pivotIndex && j>pivotIndex){
                swap(nums,i,j);
                i++;
                j--;
            } 
        }
        return pivotIndex;
    }

    static void swap(int[] nums , int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}