import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number = myObj.nextInt();
        int minutes = 10;
        String message;

        switch (number) {
            case 905:
                message = "Москва. Стоимость телефонного разговора: " + minutes * 4.15;
                break;
            case 194:
                message = "Ростов. Стоимость телефонного разговора: " + minutes * 1.98;
                break;
            case 491:
                message = "Краснодар. Стоимость телефонного разговора: " + minutes * 2.69;
                break;
            case 800:
                message = "Киров. Стоимость телефонного разговора: " + minutes * 5.00;
                break;
            default:
                message = "Нет такого города";
                break;
        }
        System.out.println(message);
    }
}
