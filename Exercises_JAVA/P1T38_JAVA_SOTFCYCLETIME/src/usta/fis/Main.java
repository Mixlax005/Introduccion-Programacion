package usta.fis;
/*
*AUTHOR: Nicolás Andrés Ramírez Calderón
*DATE: 2021-March-23
*DESCRIPTION: this program calculates the cycle time travel between 2 cities
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	p_show_info_program();
float v_time=p_time_calculator();
System.out.println("The time used to travel cycling between the cities was: "+v_time+" hours");
    }
    public static void p_show_info_program() {
        //DESCRIPTION:This method shows the software info
        //DATE:2021-March-23
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║----------------SOFTCYCLETIME VERSION 1.0-----------------║");
        System.out.println("║----------MAKER: Nicolás Andrés Ramírez Calderón----------║");
        System.out.println("║------DESCR: Calculates time travel between 2 cities------║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");

    }
    public static int p_user_distance() {
    Scanner keyboard = new Scanner(System.in);
    int v_distance;
    System.out.println("Please type the distance (Km) between the 2 cities");
    v_distance= keyboard.nextInt();
    while (v_distance<0){
        System.err.println("ERR:Invalid number typed, please type a number greater than 0");
        System.out.println("Please type the distance (Km) between the 2 cities again");
        v_distance= keyboard.nextInt();
    }
        return v_distance;
    }
    public static int p_user_speed(){
        Scanner keyboard = new Scanner(System.in);
        int v_speed;
        System.out.println("Please type the travel speed (Km/h)");
        v_speed= keyboard.nextInt();
        while (v_speed<=0){
            System.err.println("ERR:Invalid number typed, please type a number greater than 0");
            System.out.println("Please type the travel speed (Km/h) again");
            v_speed= keyboard.nextInt();
        }
    return v_speed;
    }
    public static float p_time_calculator(){
        int v_distance = p_user_distance();
        float v_time;
        int v_speed=p_user_speed();
    v_time=v_distance/v_speed;
    return v_time;
    }
}
