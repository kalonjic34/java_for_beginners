package application;

public class App {
    /*
     * Primative arrays 
     */
    public static void main(String[] args) {
        int[] numbers = new int[3];

        numbers[0] = 5;
        numbers[1] = 123;
        numbers[2] = 5;

        for(int i =0; i< 3;i++){
            System.out.println(numbers[i]);
        }
    }
}