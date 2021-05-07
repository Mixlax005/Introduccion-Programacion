package usta.fis;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float [] v_array_grades= new float[3];
        double v_total=0;
        Scanner keyboard = new Scanner(System.in);
        for (int counter=0; counter < v_array_grades.length ; counter++) {
            System.out.println("Please type your cut´s grade " + (counter+1));
            v_array_grades[counter]= keyboard.nextFloat();
            if (counter==0) {
                v_total+=v_array_grades[0] * 0.1;
                System.out.println("The first´s cut grade is" + v_array_grades[0] * 0.1);
            }
            if (counter==1) {
                v_total += v_array_grades[1] * 0.3;
                System.out.println("The second´s cut grade is" + v_array_grades[1] * 0.3);
            }
            if (counter>=2) {
                v_total+=v_array_grades[counter] * (0.6/ (v_array_grades.length - 2));
            }
        }
        System.out.println("The grades average is: " + v_total);
    }
}
