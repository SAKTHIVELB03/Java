public class selection_sort {
    public static void main(String[] args){
        int nums[] = {6,5,2,8,9,4};

        for (int i=0; i<nums.length-1; i++){
            int minIndex = i;
            for (int j=i+1; j<nums.length; j++){
                if (nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    
}
