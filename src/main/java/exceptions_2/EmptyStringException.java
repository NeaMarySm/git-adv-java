package exceptions_2;

import java.util.Scanner;
//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя!!!
public class EmptyStringException {
    public static void main(String[] args) {
        System.out.println("echo() = " + echo());
    }
    public static String echo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String input = sc.nextLine();
        if(input.isEmpty()){
            throw new RuntimeException("Empty lines are not allowed");
        }
        return input;
    }
}
