import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Введите числа через пробел!");
        Scanner myObj = new Scanner(System.in);
        String number = myObj.nextLine();
        String str[] = number.split(" ");
        int max_number = Integer.parseInt(str[0]);
        
        for (String s : str) {
            if (Integer.parseInt(s) > max_number) {
                max_number = Integer.parseInt(s);
            }
        }

        System.out.println(max_number);
    }
}
