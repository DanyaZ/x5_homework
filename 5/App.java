import java.util.Scanner;

public class App {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        int number1 = myObj.nextInt();
        int number2 = myObj.nextInt();
        int number3 = myObj.nextInt();
        int max_number;

        if (((number1>number2) && (number1>number3)) || ((number1==number2) && (number1>number3))) {
            max_number = number1;
        }
        else if (((number2>number1) && (number2>number3)) || ((number2==number3) && (number2>number1))) {
            max_number = number2;
        }
        else {
            max_number = number3;
        }

        System.out.println(max_number);
    }
}
