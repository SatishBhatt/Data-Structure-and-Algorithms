public class Maximum {
    public static void main(String[] args) {

        int[] arr = {1,333,5,8,34,9,2,4};
        System.out.println(max(arr)); //max number in arr
        System.out.println(maxBetweenRAnge(arr,2,6)); // max number in between the range
            }

        static int max(int[] arr) {
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

    static int maxBetweenRAnge(int[] arr,int start,int end) {
        int max = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    }