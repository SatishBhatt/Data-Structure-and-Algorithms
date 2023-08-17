//find first and last position of element in sorted array
public class FirstAndLAstPosition {
    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums,target);
        System.out.println("{"+ans[0] +","+ ans[1] + "}");
    }

    static int[] searchRange(int[] arr ,int target){

        int[] ans = {-1,-1};

        int start = search(arr,target,true);
        int end = search(arr,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;

    }

    static int search(int [] arr,int target,boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;//might be the potential answer

                if (findFirst == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }


        }

        return ans;
    }

}
