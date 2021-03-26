package usta.fis;
/*
 *AUTHOR: Nicolás Andrés Ramírez Calderón
 *DATE: 2021-March-25
 *DESCRIPTION: this program calculates the money saved by a person in a year
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_total_saved=0;
        for (int i = 1; i <= 12; i = i + 1) {
            System.out.println("----Month "+i+"----");
            v_total_saved=v_total_saved+p_user_saved_money();
        }
        System.out.println("The total saved money in the year is: $"+v_total_saved);
    }
    public static void p_show_info_program() {
        //DESCRIPTION:This method shows the software info
        //DATE:2021-March-23
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║----------------SOFTSAVEDMONEY VERSION 1.0----------------║");
        System.out.println("║----------MAKER: Nicolás Andrés Ramírez Calderón----------║");
        System.out.println("║-------DESCR: Calculates the saved money in a year--------║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
    public static int p_user_saved_money(){
        //This method returns the saved money in a month
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type the saved money in the month (COP)");
        int v_saved_money = keyboard.nextInt();
        while (v_saved_money<0){
            System.err.println("ERR:Invalid number typed, please type a number equal or greater than 0");
            System.out.println("Please type the saved money in the month (COP) again");
            v_saved_money = keyboard.nextInt();
        }
        return v_saved_money;
    }
}
