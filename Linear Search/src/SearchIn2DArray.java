import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {9,18,3},
                {6,7,14}
        };

        int target = 14;
       int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr,int target){

        for (int row = 0 ; row< arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){

                int element = arr[row][col];
                if(element == target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1};
    }
}
