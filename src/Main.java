import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String date;

        while(true){
            try {
                Scanner scan = new Scanner(System.in);
                date = scan.next("(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012]).((19|20)\\d\\d)");
                scan.close();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Вы ввели дату в неправильном формате! Введите еще раз!");
            }
        }
        int year = Integer.parseInt(date.substring(date.length() - 4));

        if(year % 4 == 0){
            System.out.println("Год високосный");
        }
        else{
            System.out.println("Год не високосный");
        }

    }
}