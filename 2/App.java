import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String str = myObj.nextLine();
        int SumNumber = 0;

        for (int i = 0; i < str.length(); i++) {
            SumNumber += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(SumNumber);
    }
}
