package usta.fis;
import java.util.Scanner;

//AUTHOR: Nicolás Andrés Ramírez Calderón
//DATE:16/04/2021
//DESCRIPTION: this program operates numbers according to the operation you want to do
public class Main {


    public static void main(String[] args) {
        int v_operation;
        p_show_info_program();
        Scanner keyboard = new Scanner(System.in);
        int v_number_1;
        int v_number_2;
        do {
            System.out.println("Please type the first number");
            v_number_1 = keyboard.nextInt();
            System.out.println("Please type the second number");
            v_number_2 = keyboard.nextInt();
            System.out.println("Please select de operation you want to do: 1(Sum) 2(Substract) 3(Multiplication) 4(Division) 5(Prime number) 0(Exit)");
            v_operation = keyboard.nextInt();
            System.out.println("The result is: "+ p_operate_numbers(v_number_1, v_number_2, v_operation));
        } while (v_operation != 0);

    }

    private static void p_show_info_program() {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║------------------CALCULATOR VERSION 1.0------------------║");
        System.out.println("║---------MAKER: Nicolás Andrés Ramírez Calderón-----------║");
        System.out.println("║----DESCR: This programs works as a simple calculator-----║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }

    public static String p_operate_numbers(int v_number_1, int v_number_2, int v_operation) {
        int v_result = 0;
        String v_convert = "";
        switch (v_operation) {
            case 1 -> v_result = v_number_1 + v_number_2;
            case 2 -> v_result = v_number_1 - v_number_2;
            case 3 -> v_result = v_number_1 * v_number_2;
            case 4 -> v_result = v_number_1 / v_number_2;
            case 5 -> {
                v_convert = "isn´t a prime number";
                if (p_validate_prime(v_number_1)) {
                    v_convert = "is a prime number";
                }
            }
            default -> {
                v_convert = "Exit";
                System.exit(0);
            }
        }
            if(v_convert.isEmpty()){
                v_convert=String.valueOf(v_result);
            }
        return v_convert;
        }

        public static String p_prime_numbers(int v_prime){
            return "";
        }

    public static boolean p_validate_prime(int v_prime){
        int numbers_divide = 0;
        for(int i=1;i<=v_prime;i++) {
            if (v_prime%i == 0){
                numbers_divide++;
            }
        }
        return numbers_divide == 2;
    }
}
