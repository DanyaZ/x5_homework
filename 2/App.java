import java.util.Scanner;

public class App {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        int number = myObj.nextInt();
        int sum = 0;

        for (int i = 0; i < number; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}