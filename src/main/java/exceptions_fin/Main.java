package exceptions_fin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data: \nname second_name last_name phone_number date_of_birth sex \nin random order separated by space\n");
        String data = sc.nextLine();
        String[] formatted = parseData(data, 6);

        String fileName = formatted[0] + ".txt";
        File file = new File(fileName);
        boolean appendData = file.exists();

        try (BufferedWriter bf = new BufferedWriter(new FileWriter(file, appendData))) {
            bf.write(String.join(" ", formatted));
            bf.write("\n");
        } catch (IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

    }

    public static String getData(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    public static String[] parseData(String string, int dataAmount) throws RuntimeException {
        Validator validator = new Validator();
        String[] temp = string.split(" ");
        if (!validator.validateAmount(temp, dataAmount)) {
            throw new RuntimeException("Invalid amount of data");
        }
        String firstName = "";
        String secondName = "";
        String lastName = "";
        String dateOfBirth = "";
        String phone = "";
        String sex = "";
        for (String s : temp) {
            if (validator.validateSex(s) && sex.isEmpty()) {
                sex = s;
            } else {
                if (validator.validateDate(s) && dateOfBirth.isEmpty()) {
                    dateOfBirth = s;
                } else {
                    if (validator.validatePhone(s) && phone.isEmpty()) {
                        phone = s;
                    } else {
                        if (validator.validateName(s)) {
                            if (firstName.isEmpty()) {
                                firstName = s;
                            } else {
                                if (secondName.isEmpty()) {
                                    secondName = s;
                                } else {
                                    if (lastName.isEmpty()) {
                                        lastName = s;
                                    } else throw new RuntimeException("Invalid data");
                                }
                            }

                        } else {
                            throw new RuntimeException("Invalid data format");
                        }
                    }
                }
            }
        }
        return new String[]{lastName, firstName, secondName, dateOfBirth, phone, sex};
    }
}

