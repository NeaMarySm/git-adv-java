package exceptions_1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        T_1 test = new T_1();
        test.doSomething();

        try(Counter cnt = new Counter()) {
            cnt.add();
            cnt.add();
            cnt.add();
            System.out.println(cnt.counter);
            cnt.close();
            cnt.add();
        } catch (IOException e){
            System.out.println("Error");
        }


    }
}
