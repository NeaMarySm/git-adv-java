package exceptions_2;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"2","4"},{"or",null},{"0","4"}};
        System.out.println(sum2d(array));
    }
    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int val;
                try{
                    val = Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    val = 0;
                }
                sum+=val;
            }
        }
        return sum;
    }
}
