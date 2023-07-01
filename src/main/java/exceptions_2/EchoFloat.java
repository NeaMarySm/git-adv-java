package exceptions_2;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения,
//вместо этого, необходимо повторно запросить у пользователя ввод данных.
import java.util.Scanner;

public class EchoFloat {
    public static void main(String[] args) {
        System.out.println("echo() = " + echo());

    }

    public static Float echo() {
        Scanner sc = new Scanner(System.in);
        String input;
        Float result = null;
        while (result == null) {
            System.out.println("Enter number:");
            input = sc.nextLine();
            try {
                result = Float.parseFloat(input);
            } catch (Exception e) {
                result = null;
            }
        }
        return result;
    }

}
