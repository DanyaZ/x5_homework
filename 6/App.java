import java.util.Scanner;

public class App {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        int number = myObj.nextInt();
        String name_number;

        if ((number>0) & (number%2==0)) {
            name_number = "положительное четное число";
        }
        else if ((number>0) & (number%2!=0)) {
            name_number = "положительное нечетное число";
        }
        else if ((number<0) & (number%2==0)) {
            name_number = "отрицательное четное число";
        }
        else if ((number<0) & (number%2!=0)) {
            name_number = "отрицательное нечетное число";
        }
        else {
            name_number = "нулевое число";
        }

        System.out.println(name_number);
    }
}
