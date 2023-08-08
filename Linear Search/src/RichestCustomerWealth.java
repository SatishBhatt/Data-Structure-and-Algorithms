public class RichestCustomerWealth {
    public static void main(String[] args) {

        int[][] arr = {
                {1,5},
                {7,3},
                {3,5,9}
        };

        System.out.println(maxWealth(arr));
    }

    static int maxWealth(int[][] arr){
        int max = 0 ;
        for (int person = 0 ; person< arr.length ; person++){

            int sum = 0 ;
            for(int wealth = 0 ; wealth < arr[person].length ; wealth++){
                sum = sum + arr[person][wealth];
            }

            if(sum > max){
                max = sum;
            }
        }
        return max;

    }
}
