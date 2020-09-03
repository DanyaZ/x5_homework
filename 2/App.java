import java.util.Scanner;

public class App {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        String str = myObj.nextLine();

        int number1 = Character.getNumericValue(str.charAt(0));
        int number2 = Character.getNumericValue(str.charAt(1));
        int number3 = Character.getNumericValue(str.charAt(2));

        System.out.println(number1+number2+number3);
    }
}
