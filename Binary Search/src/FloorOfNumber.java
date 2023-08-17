//Floor of Number: the closest integer less than or equal to a given number

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 4;
        int ans = searchFloor(arr,target);
        System.out.println(ans);
    }

     static int searchFloor(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        while(start <= end ){

            int mid = start +(end - start)/2;

            if(arr[mid] > target){
                end = mid -1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else return mid;
        }

        return end;
    }

}
