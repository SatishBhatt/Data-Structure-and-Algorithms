//given an array ,return how many of them contain even number of digits

public class EvenDigits {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};

        System.out.println(find(nums));
    }

    static int find(int[] nums){
     int count = 0 ;

     for (int num : nums) {

         if(even(num)){
             count++;

         }

     }
     return count;
    }

    //function to check if number conatin even numbers or not
    static  boolean even(int num){
        int noOfDigits = digits(num);
        if(noOfDigits % 2 ==0){
            return true;
        }
        return false;
    }


    static int digits(int num){
        int count = 0;

        while (num > 0 ){
            count++;
            num = num / 10;
        }

        return count;
    }
}
