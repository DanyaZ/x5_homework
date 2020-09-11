import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number = myObj.nextInt();

        if (number > 0) {
            number++;
        }

        System.out.println(number);
    }
}
