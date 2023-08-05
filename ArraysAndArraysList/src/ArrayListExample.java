import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> a1  = new ArrayList<>(5);
//        a1.add(21);
//        a1.add(23);
//        a1.add(44);
//        a1.add(75);
//        a1.add(568);
//        a1.add(232);
//        a1.add(8678);
//        a1.add(232);
//
//        a1.set(1,22);
//        System.out.println(a1);
//        System.out.println(a1.contains(44));

        //input
        for(int i = 0 ; i < 5 ; i++){
            a1.add(sc.nextInt());
        }

        //output
        for(int i = 0 ; i < 5 ; i++){
            System.out.print(a1.get(i) + " ");
        }
    }
}
