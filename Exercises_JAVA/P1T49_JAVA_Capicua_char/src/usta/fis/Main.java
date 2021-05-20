package usta.fis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int prueba = 5;
        Scanner keyboard = new Scanner(System.in);
        String cadena;
        System.out.println("This program shows info about capicua letters or numbers, or ENTER to exit");
        System.out.println("Please type the word or number you want to capicua verify");
        cadena = keyboard.next();
        System.out.println("The analisis of the value you typed is: " + CapicuaAnswer(cadena));
        System.out.println(prueba / 2);

    }

    public static String CapicuaAnswer(String cadena) {
        if (capicuaMethod(cadena)) {
            return "es capicua y la suma de sus extremos es: "+sum(cadena);
        }
        return "NO es capicua";
    }

    public static boolean capicuaMethod(String cadena) {
        char[] CharArray;
        CharArray = cadena.toCharArray();
        for (int i = 0; i < CharArray.length; i++) {
            if (CharArray[i] != CharArray[CharArray.length - (1 + i)]) {
                return false;
            }
        }
        return true;
    }

    public static int sum(String cadena) {
        int sum = 0;
        char[] CharArray;
        CharArray = cadena.toCharArray();
        for (int i = 0; i < CharArray.length; i++) {
            sum+=CharArray[i];
            }
        if (CharArray.length % 2 == 1) {
            sum+=CharArray[CharArray.length/2+1];
        }
        return sum;
    }
}

