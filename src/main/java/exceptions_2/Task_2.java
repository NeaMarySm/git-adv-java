package exceptions_2;


//Задание 2
//        try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }


public class Task_2 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        task2(intArray, 2, 4);
    }
    public static void task2(int[] intArray, int index, double d) {
        if (index >= 0 && index < intArray.length && d != 0) {
            double catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } else {
            System.out.println("Unavailable arguments");
        }
    }
}
