//find smallest letter greater than target
public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] arr = {'x','x','y','y'};
        char target = 'z';

        char ans = searchLetter(arr,target);
        System.out.println(ans);
    }

    static char searchLetter(char[] arr , char target){

        int start = 0;
        int end = arr.length -1 ;

        //if the target is the larget letter in the arr then return first char of arr.
        if(target == arr[arr.length -1]){
            return arr[0];
        }

        while(start <= end){

            int mid = start + (end - start)/2;


           if (target < arr[mid]) {
                end = mid -1;
            }
            else {
                start = mid + 1;
            }



        }

     return arr[start % arr.length];
    }
}
