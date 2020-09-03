import java.util.Scanner;

public class App {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        int number = myObj.nextInt();
        String message;

        if (number == 905) {
            message = "Москва. Стоимость телефонного разговора: " + 10*4.15;
        }
        else if (number == 194) {
            message = "Ростов. Стоимость телефонного разговора: " + 10*1.98;
        }
        else if (number == 491) {
            message = "Краснодар. Стоимость телефонного разговора: " + 10*2.69;
        }
        else {
            message = "Киров. Стоимость телефонного разговора: " + 10*5.00;
        }
        System.out.println(message);
    }
}
