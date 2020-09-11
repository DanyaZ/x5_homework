import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] intArray = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int[] intArray_new = new int[intArray.length];
        int j = 0;

        for (int i = 0; i < intArray.length; i++) {

            if (intArray[i] != 0) {
                intArray_new[j] = intArray[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(intArray_new));

    }
}
