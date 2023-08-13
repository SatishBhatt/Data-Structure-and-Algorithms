
public class Main {
    public static void main(String[] args) {
       int [] arr = {1,3,5,7,9,14,17,29,25,40,66,99} ;
       int target = 7;

        System.out.println(binarySearch(arr,target));



    }


    static int binarySearch(int[] arr, int target){
        //this will return -1 if there is no element equal to target in the array

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){

            int mid = start + (end - start )/2  ;

            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

      return -1;
    }
}