import java.util.*;

public class Array{
    public static void main(String[] args) throws InterruptedException {
        // Arrays
        int[] numbers = new int[5];
        System.out.println(numbers[1]);

        int[] numbers2 = {6,4,3,0,1};
        System.out.println(numbers2[2]);

        // exception
        // System.out.println(numbers2[9]);

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers2));

        // length of the array
        System.out.println(numbers.length);

        // sort an array
        Arrays.sort(numbers2);

        System.out.println(Arrays.toString(numbers2));
    }
}