import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number = myObj.nextInt();
        String name_number;

        if (number != 0) {
            System.out.println(PositiveOrNegative(number) + " " + Parity(number));
        } else {
            System.out.println(PositiveOrNegative(number));
        }
    }

    public static String PositiveOrNegative(int number) {
        String word;
        if (number > 0) {
            word = "положительное";
        } else if (number < 0) {
            word = "отрицательное";
        } else {
            word = "нулевое число";
        }
        return word;
    }

    public static String Parity(int number) {
        String word;

        if (number % 2 == 0) {
            word = "четное число";
        } else {
            word = "нечетное число";
        }
        return word;
    }

}
