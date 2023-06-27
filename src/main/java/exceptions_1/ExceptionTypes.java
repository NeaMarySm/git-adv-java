package exceptions_1;

import jdk.jfr.Timestamp;

import java.sql.Time;
import java.util.Date;

public class ExceptionTypes {

    public void printElement(int n) {
        int[] array = {1, 2, 3, 4, 5, 6};
        if (n < 0 || n >= array.length) {
            throw new RuntimeException("Unexpected index"); //IndexOutOfBoundsException

        } else {
            System.out.println("Element with index " + n + ": " + array[n]);
        }
        System.out.println("End");
    }

    public String substring(String text, int start, int end) {
        if (text == null) {
            throw new RuntimeException("text can't be null"); //NullPointerException
        }
        if (start < 0 || start > text.length() || end < 0 || end > text.length()) {
            throw new RuntimeException("Invalid start or end value"); //StringIndexOutOfBoundsException
        }
        if (end < start) {
            throw new RuntimeException("End index should be greater then start index");//StringIndexOutOfBoundsException
        }
        return text.substring(start, end);
    }
    public void showDate(){
        Date today = new Date();
        Time time = (Time) today; // throws ClassCastException
    }
}
