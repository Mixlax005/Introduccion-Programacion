package usta.fis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int v_number1, v_number2, v_result, v_operation;
        Scanner keyboard = new Scanner(System.in);
        p_show_info_program();
        do {
            System.out.println("Please type the number of the operation you want to execute (1 to add, 2 to substract, 3 to multiply, 4 to divide, 5 to prime number, 0 to exit)");
            v_operation = keyboard.nextInt();
            System.out.println("Please type the 1st number you want to operate");
            v_number1 = keyboard.nextInt();
            System.out.println("Please type the 2nd number you want to operate");
            v_number2 = keyboard.nextInt();
            v_result = p_operation(v_number1, v_number2, v_operation);
            System.out.println("The result of the operation you selected is: " + v_result);
        }
        while (v_operation!=0);
    }

    public static int p_operation(int v_number1, int v_number2, int v_operation) {
        if (v_operation >= 0&&v_operation <= 4) {
            if (v_operation == 1) {
                return v_number1 + v_number2;
            }
            else if (v_operation == 2) {
                return v_number1 - v_number2;
            }
            else if (v_operation == 3) {
                return v_number1 * v_number2;
            }
            else if (v_operation == 4&&v_number2 != 0) {
                return v_number1 / v_number2;
            }
            else if (v_operation==5){
                p_validate_prime_number(v_number1);
            }
        }
        return 0;
    }

    public static void p_show_info_program() {
        // DATE: 07/05/2021
        // AUTHOR: Nicolás Andrés Ramírez Calderón
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║----------------------CALCULATOR V2.0---------------------║");
        System.out.println("║---------MAKER: Nicolás Andrés Ramírez Calderón-----------║");
        System.out.println("║-----DESCR: This program works as a simple calculator-----║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
    public static boolean p_validate_prime_number(int v_number1){
        int v_counter = 0;
        boolean v_prime;
        for (int i=0; i+1<=(v_number1/2); i++ ){
            if (v_number1 % i+1 == 0){
                v_counter++;
            }
        }
        if (v_counter==1){
           return v_prime=true;
        }
        return v_prime=false;
    }
}
