import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {

        int[] arr = {1,32,5,7,8,54,33,87};

        swap(arr,1,2); // this function swap the value of index 1 and index 2 of arr.
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
