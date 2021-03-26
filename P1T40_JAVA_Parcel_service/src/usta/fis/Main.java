package usta.fis;
/*
 *AUTHOR: Nicolás Andrés Ramírez Calderón
 *DATE: 2021-March-25
 *DESCRIPTION: this program calculates the shipping cost depending of the weight of the product and location to be sent
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
    }
    public static void p_show_info_program() {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║--------------PARCELSERVICESOFT VERSION 1.0---------------║");
        System.out.println("║---------MAKER: Nicolás Andrés Ramírez Calderón-----------║");
        System.out.println("║----------DESCR: Calculates the shipping cost ------------║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
    public static void p_price(){
//This method returns the price of the shipping
Scanner keyboard = new Scanner(System.in);
System.out.println("Please type the number according to the location where you want to send the product." +
        "The available locations are: 1.North America $11.00, 2.Central America $10.00, 3.South America $12.00," +
        "4.Europe $24.00, 5.Asia 27.00");
        int v_location = keyboard.nextInt();
        while (v_location != 1 & (v_location != 2) & (v_location != 3) & (v_location != 4) & (v_location != 5)){

        }
    }
}
