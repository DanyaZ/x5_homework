import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] intArray = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int[]  intArray_reverse = new int[intArray.length];
        int j = 0;

        for (int i = intArray.length-1; i >= 0; i--) {
            intArray_reverse[j] = intArray[i];
            j++;

        }
        System.out.println(Arrays.toString(intArray_reverse));

    }
}
