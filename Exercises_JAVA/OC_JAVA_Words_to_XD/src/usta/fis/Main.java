package usta.fis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        p_show_info_program();
        System.out.println("Please type the phrase you want to turn in XD expression");
        String v_phrase = keyboard.nextLine();

        System.out.println(v_phrase);
    }
    public static void p_show_info_program() {
        // DATE: 03/05/2021
        // AUTHOR: Nicolás Andrés Ramírez Calderón
        System.out.println("╔═════════════════════════════════════════════════════════╗");
        System.out.println("║----------------------XD CONVERTER-----------------------║");
        System.out.println("║---------MAKER: Nicolás Andrés Ramírez Calderón----------║");
        System.out.println("║----DESCR: This program turns ASCII in XD expressions----║");
        System.out.println("╚═════════════════════════════════════════════════════════╝");
    }
}
