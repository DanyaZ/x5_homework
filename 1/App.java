import java.util.Scanner;

public class App {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        String str = myObj.nextLine();
        int len = str.length();
        System.out.println(str.charAt(len-1));
    }
}
