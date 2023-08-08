//search for 3 in the range of index[1,4]

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 18,12,-7,3,14,28};
        int target = 3;
        System.out.println(search(arr,target,1,4));
    }

    static int search(int[] arr, int target,int start, int end){

        for (int i = start ; i<= end ; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
