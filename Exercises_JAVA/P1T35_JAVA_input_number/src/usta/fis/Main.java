package usta.fis;
//AUTHOR: Nicolás Andrés Ramírez Calderón
//DATE: 2021-March-16
//DESCRIPTION: this program show the variable typed in the keyboard

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	System.out.println("--------------------");
	System.out.println("Softinput V1.0");
	System.out.println("MAKER: Nicolás Andrés Ramírez Calderón");
	System.out.println("--------------------");
	Scanner keyboard = new Scanner(System.in);
	int v_number1, v_number2, v_sum;
	System.out.println("please type the 1st number");
	v_number1=keyboard.nextInt();
	System.out.println("please type the 2nd number");
	v_number2=keyboard.nextInt();
	v_sum=v_number1+v_number2;
	System.out.println("The total sum of the numbers typed is: " + v_sum);
    }
}
