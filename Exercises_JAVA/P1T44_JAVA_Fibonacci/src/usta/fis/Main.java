package usta.fis;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        p_show_info_program();
        System.out.println("Welcome to Fibonacci Software. Please, insert the value limit that you want see of Fibonacci serie:");
        int serie = keyboard.nextInt();
        while (serie <= 0) {
            System.err.println("Remember, the number should be greater than 0. Please, input the number again.");
            serie = keyboard.nextInt();
        }
        int[] fibo_array;
        fibo_array = p_fibonacci_series(serie);
        System.out.println("Fibonacci Series for: " + serie + "");
        for (int i = 0; fibo_array[i] != -1; i++) {
                System.out.print((fibo_array[i])+", ");
        }
    }
        public static void p_show_info_program () {
            // DATE: 03/05/2021
            // AUTHOR: Nicolás Andrés Ramírez Calderón
            System.out.println("╔══════════════════════════════════════════════════════════╗");
            System.out.println("║-----------------------FIBONACCI V1.0---------------------║");
            System.out.println("║---------MAKER: Nicolás Andrés Ramírez Calderón-----------║");
            System.out.println("║----DESCR: This program calculates the fibonacci series---║");
            System.out.println("╚══════════════════════════════════════════════════════════╝");
        }
        public static int[]p_fibonacci_series(int v_limit){
        int[] fibo_array = new int[100];
        fibo_array[0]=0;
        fibo_array[1]=1;
        for (int i=1; fibo_array[i-1]+fibo_array[i]<= v_limit; i++) {
            fibo_array[i + 1] = fibo_array[i - 1] + fibo_array[i];
            fibo_array[i + 2] = -1;
        }
        return fibo_array;
        }
}