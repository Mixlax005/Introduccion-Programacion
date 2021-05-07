package co.edu.usta.tunja.array.v2;
import java.util.Scanner;
public class ArrayOfVector {
    public static void main(String[] args) {
        int[] arrayV1 = new int[5];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type 5 even values for the array");
        for (int i = 0; i < arrayV1.length; i++) {
            System.out.println("Please type the even value " + (i + 1));
            arrayV1[i] = keyboard.nextInt();
            while (arrayV1[i]%2 != 0){
                System.err.println("ERR:Invalid number typed, please type the number again");
                System.out.println("Please type the even value " + (i + 1));
                arrayV1[i] = keyboard.nextInt();
            }
        }
        for (int i = 0; i < arrayV1.length; i++) {
            System.out.println("The value " + (i + 1) + " is: " + arrayV1[i]);
        }
    }
}
