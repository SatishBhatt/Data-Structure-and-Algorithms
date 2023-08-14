public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

        int[] arr = {99,88,66,44,2,1,-3,-9};
        int target = 1;



        int ans = search(arr,target);
        System.out.println(ans);

    }

    static int search(int[] arr ,int target){

        int start = 0;
        int end = arr.length -1 ;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end ){

            int mid= start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            else if(isAsc){

                if(target > arr[mid]){
                    start= mid+1;
                } else if (target < arr[mid]) {
                    end = mid-1;
                }
                else{
                    return mid;
                }

            }

            else {
                if(target > arr[mid]){
                    end= mid-1;
                } else if (target < arr[mid]) {
                    start = mid +1;
                }
                else{
                    return mid;
                }

            }


        }
        return -1;
    }
}
