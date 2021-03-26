package usta.fis;
/*
 *AUTHORS: Nicolás Andrés Ramírez Calderón
 *Cristhian Arley Susano Fernández
 *Juan Pablo Orjuela
 *DATE: 2021-March-25
 *DESCRIPTION: 1st test grade, This program calculates the height average of 5 children
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        p_show_info_program();
int v_height_sum = 0;
int v_average = 0;
for (int i = 1; i <= 5; i = i +1 ) {
    System.out.println("----------"+i + "(st/nd/th) child----------");
    v_height_sum = v_height_sum + p_user_height();
}
v_average=v_height_sum/5;
System.out.println("The height average of the 5 children is: "+v_average+" cm");
    }
    public static void p_show_info_program() {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║--------------SOFTAVERAGEHEIGHT VERSION 1.0---------------║");
        System.out.println("║---------MAKERS: Nicolás Andrés Ramírez Calderón----------║");
        System.out.println("║-------------Cristhian Arley Susano Fernández-------------║");
        System.out.println("║--------------------Juan Pablo Orjuela--------------------║");
        System.out.println("║---DESCR: 1st test grade, Calculates the average height---║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
    public static int p_user_height() {
//This method returns the height of the children
Scanner keyboard= new Scanner(System.in);
System.out.println("Please type the height of the child(cm)");
int v_child_height = keyboard.nextInt();
while (v_child_height<50 || v_child_height>200){
    System.err.println("ERR:Invalid number typed, please type a number between 50 and 200");
    System.out.println("Please type again the height of the child(cm)");
v_child_height = keyboard.nextInt();
}
return v_child_height;
    }
}
