
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,6,13,7,567,89};
        int target = 7;

       int result =  linearSearch(arr,target);
        System.out.println(result);
           }

           static int linearSearch(int[] arr,int target){

                if (arr.length == 0){
                    return -1;

                }

                for (int i = 0 ; i < arr.length ; i++){

                    int element = arr[i];

                    if(element == target){
                        return i;
                    }
                }

                return -1;
           }
}