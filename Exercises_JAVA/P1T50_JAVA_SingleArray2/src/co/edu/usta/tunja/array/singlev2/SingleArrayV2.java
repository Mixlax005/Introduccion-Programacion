package co.edu.usta.tunja.array.singlev2;
import java.util.Scanner;
public class SingleArrayV2 {
    public static void main(String[] args) {
        int [] mySingleArray;
        int size = 0;
        int i = 0;
        int grade = 0;
        float average;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type the size of the single array");
        size = keyboard.nextInt();
        mySingleArray= new int[size];

        while (i< mySingleArray.length) {
            System.out.println("Please type the "+(i+1)+" grade: ");
            grade = keyboard.nextInt();
            mySingleArray[i]=grade;
            i++;
        }
        average=calculateAverage(mySingleArray);
        int sum=gradesumatory(mySingleArray);
        System.out.println("The summatory of your grade is: "+sum+" Your average grades is: "+average);
        i=0;
        System.out.println("The grades you typed are:");
        while (i< mySingleArray.length){
            System.out.print(mySingleArray[i]+" ,");
            i++;
        }
    }
    public static float calculateAverage(int [] mySingleArray){
        float average=0;
        int sum=0;
        sum = gradesumatory(mySingleArray);
        average= sum/mySingleArray.length;
        return average;
        }
    public static int gradesumatory(int [] mySingleArray){
        int counter=0, sum =0;
        while (counter< mySingleArray.length){
            sum =+ mySingleArray[counter];
            counter++;
    }
        return sum;
    }
}
