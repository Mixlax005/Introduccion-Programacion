package usta.fis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        float [] p_vector= new float[5];
        float p_total=0;
        float v_height=p_vector.length;

        Scanner keyboard = new Scanner(System.in);
        for (int counter=0; counter < p_vector.length ; counter++) {
            System.out.println("Please type your cut´s grade "+(counter+1));
            p_vector[counter]= keyboard.nextFloat();
            p_total=p_total+p_vector[counter];

        }
        p_total=p_total/v_height;
        System.out.println("The grades average is: " +p_total);
    }
}
