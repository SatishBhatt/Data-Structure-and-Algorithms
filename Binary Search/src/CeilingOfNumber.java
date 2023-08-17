//Ceiling of Number : the least integer number greater than or equal to the given number.
public class CeilingOfNumber {
    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};
        int target = 4;
        int ans = searchNum(arr,target);
        System.out.println(ans);

    }

    static int searchNum(int [] arr,int target){

        int start = 0;
        int end = arr.length-1;


        //if the target number is the largest number in the array
        if(target == arr[arr.length-1]){
            return -1;
        }

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] > target){
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        return start;
    }
}
