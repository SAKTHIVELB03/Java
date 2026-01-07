public class Searching {
    public static void main(String[] args) {
        int nums[] = {5,7,9,11,13};
        int target = 11;

        //int result =linearSearch(nums, target);
        int result =binarySearch(nums, target);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found in the array");
    }

    public static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target){
        //5,7,9,11,13

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}