package exceptions_1;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
//        T_1 test = new T_1();
//        test.doSomething();
//
//        try(Counter cnt = new Counter()) {
//            cnt.add();
//            cnt.add();
//            cnt.add();
//            System.out.println(cnt.counter);
//            cnt.close();
//            cnt.add();
//        } catch (IOException e){
//            System.out.println("Error");
//        }

        ExceptionTypes ext = new ExceptionTypes();
        ext.printElement(5);
        ext.printElement(10);
        String msg = "null";
        System.out.println("ext.substring(msg, 2,4) = " + ext.substring(msg, 3, 2));
        ext.showDate();
    }
}
