package arry;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

       int[] rools = {1, 3, 5, 7, 9};
//        System.out.println(Arrays.toString(rools));
        for(int i = 0; i < rools.length; i++){
            System.out.println(rools[i]);
        }

        System.out.println("Ended");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        System.out.println("Ended2");
        System.out.println(" ");
        String[] names = {"Nazmul", "Sakib", "Hasan", "Sofia"};
        for(String name : names){
            System.out.println(name);
        }
    }

}
