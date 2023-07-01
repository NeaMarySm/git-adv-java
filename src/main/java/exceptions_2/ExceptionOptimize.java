package exceptions_2;

import java.io.*;

public class ExceptionOptimize {
    public static void main(String[] args) {
        InputStream inputStream;
        try{
            String[] strings = {"asdf","asdf"};
            String strings1 = strings[2];
            test();
            int a =1/0;
            inputStream = new FileInputStream("sdafgsaf");

        } catch (Throwable e){
            e.printStackTrace();

        } finally {
            System.out.println("I was executed anyway!");
        }
        System.out.println("I'm alive!");
    }
    public static void test() throws IOException{
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}
