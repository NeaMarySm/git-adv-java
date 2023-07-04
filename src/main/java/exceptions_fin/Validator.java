package exceptions_fin;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validator {
    public boolean validateAmount(String[] array, int dataCount) {
        return array.length == dataCount;
    }

    public boolean validateName(String name) {
        boolean result = true;
        for (int i = 0; i < name.length() && result; i++) {
            if (Character.isDigit(name.charAt(i))) {
                result = false;
            }
        }
        return result;
    }

    public boolean validatePhone(String phone) {
        boolean result = true;
        for (int i = 0; i < phone.length() && result; i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                result = false;
            }
        }
        return result;
    }
    public boolean validateDate(String date){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            sdf.setLenient(false);
            sdf.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean validateSex(String sex){
        return sex.equalsIgnoreCase("f") || sex.equalsIgnoreCase("m");
    }

}
