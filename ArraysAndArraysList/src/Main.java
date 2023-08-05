import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
       //Array is collection of datatype
        // int [] arr;  --------->declaration of an array-arr is getting defined in stack
        //     ros = new int[3]; ---------> Initialization -- here actual memory creation is happened in heap.
        int [] arr = new int [3];
        arr[0] = 12;
        arr[1] = 11;
        arr[2] = 10;

        //int arr[] = {12,11,10};

        for (int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i] + " ");

        }

        }
    }
