package usta.fis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner keyboard= new Scanner(System.in);
        int [] CapicuaArray, CapicuaValues;
        int size, i=0;
        System.out.println("Please type the size of the single array");
        size = keyboard.nextInt();
        CapicuaArray= new int[size];
        while (i< CapicuaArray.length) {
            System.out.println("Please type the "+(i+1)+" value: ");
            CapicuaArray[i]= keyboard.nextInt();
            i++;
        }
        CapicuaValues=CapicuaVerifier(CapicuaArray, size);
        for (int k=0; k<CapicuaValues.length; k++){
         System.out.println(CapicuaValues[k]);
        }
    }
    public static int [] CapicuaVerifier(int [] CapicuaArray, int size){
        int lastdigit, invertedvalue=0, k=0, helpnum=1;
        int [] CapicuaValues = new int[size];
        for (int i = 0; helpnum!=0; i++){
            helpnum=CapicuaArray[i];
            while(helpnum!=0) {
                lastdigit = helpnum % 10;
                invertedvalue = (invertedvalue * 10) + lastdigit;
                helpnum=helpnum/10;
            }
            if (CapicuaArray[i]==invertedvalue) {
                CapicuaValues[k] = CapicuaArray[i];
                k++;
            }
        }
        return CapicuaValues;

    }
}
