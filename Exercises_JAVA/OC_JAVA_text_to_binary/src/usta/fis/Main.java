package usta.fis;
/*
  ____          _____               _ _           _
 |  _ \        |  __ \             (_) |         | |
 | |_) |_   _  | |__) |_ _ _ __ _____| |__  _   _| |_ ___
 |  _ <| | | | |  ___/ _` | '__|_  / | '_ \| | | | __/ _ \
 | |_) | |_| | | |  | (_| | |   / /| | |_) | |_| | ||  __/
 |____/ \__, | |_|   \__,_|_|  /___|_|_.__/ \__, |\__\___|
         __/ |                               __/ |
        |___/                               |___/
____________________________________
/ Si necesitas ayuda, contáctame en \
\ https://parzibyte.me               /
 ------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||
Creado por Parzibyte (https://parzibyte.me). Este encabezado debe mantenerse intacto,
excepto si este es un proyecto de un estudiante.
* */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String originalText = "parzibyte.me";
        System.out.println("Texto original: " + originalText);
        String translatedText = textToBinary(originalText);
        System.out.println("Convertido a binario es: " + translatedText);


        System.out.println("-----------------");

        System.out.println("╔═════════════════════════════════════════════════════════╗");
        System.out.println("║---------------------XD CONVERTER------------------------║");
        System.out.println("║--------MOD BY: Nicolás Andrés Ramírez Calderón----------║");
        System.out.println("║------DESCR: This MOD turns text in XD expressions-------║");
        System.out.println("╚═════════════════════════════════════════════════════════╝");


        String binaryText = "1110000 1100001 1110010 1111010 1101001 1100010 1111001 1110100 1100101 101110 1101101 1100101";
        System.out.println("Binario: " + binaryText);
        String translatedBinary = binaryToText(binaryText);
        String v_base_XD_message=binaryToBaseXD(binaryText);
        System.out.println("Convertido a texto es: " + translatedBinary);
        // También podemos convertir algo que el usuario proporcione
        String userText = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type the number of the procedure you want to execute (1. convert text to binary 2. convert binary to text 3. convert text to XD 4. XD to text 5. Exit)");
        int v_procedure = keyboard.nextInt();
        while (v_procedure>5 || v_procedure<0) {
            System.err.println("Invalid number typed, please type the procedure number again");
            System.out.println("Please type the number of the procedure you want to execute (1. convert text to binary 2. convert binary to text 3. convert text to XD 4. XD to text 0. Exit)");
            v_procedure = keyboard.nextInt();
        }
        while (v_procedure != 0){
            if (v_procedure==1){
                System.out.println("Please type the text you want to convert to binary");
                userText = sc.nextLine();
                translatedText = textToBinary(userText);
                System.out.println(translatedText);
            }
            else if (v_procedure== 2) {
                System.out.println("Please type the binary you want to convert in text");
                userText = sc.nextLine();
                translatedBinary = binaryToText(userText);
                System.out.println(translatedBinary);
            }
            else if (v_procedure== 3){
                System.out.println("Please type the text you want to convert in XD");
                userText = sc.nextLine();
                translatedText=textToBinary(userText);
                v_base_XD_message=binaryToBaseXD(userText);
                System.out.println(v_base_XD_message);
            }
            else {
                System.out.println("Please Type the XD you want to convert in text");
            }
            System.out.println("Please type the number of the procedure you want to execute (1. convert text to binary 2. convert binary to text 3. convert text to XD 4. XD to text 0. Exit)");
            v_procedure = keyboard.nextInt();
        }
    }

    public static String binaryToText(String binaryText) {
        // Necesitamos separar cada número binario por espacio. Usamos split
        String[] binaryNumbers = binaryText.split(" ");
        String text = "";
        // Los recorremos. En cada paso tenemos al número binario
        for (String currentBinary : binaryNumbers) {
            // Ahora convertimos ese binario a decimal
            int decimal = binaryToDecimal(currentBinary);
            // Obtenemos la letra que le corresponde a ese valor ASCII
            char letra = (char) decimal;
            text += letra;
        }
        return text;
    }


    public static String textToBinary(String originalText) {
        String binaryText = "";
        for (int i = 0; i < originalText.length(); i++) {
            // Primero obtenemos la letra o carácter actual
            char currentChar = originalText.charAt(i);
            // Necesitamos obtener su representación entera ASCII
            int ascii = (int) currentChar;
            // Una vez que ya tenemos el entero, lo convertimos a binario
            String binary = decimalToBinary(ascii);
            // Lo agregamos a la cadena resultante agregando además un espacio
            binaryText += binary + " ";
        }
        // Finalmente regresamos el texto
        return binaryText;
    }

    public static int binaryToDecimal(String binary) {
        // A este número le vamos a sumar cada valor binario
        int decimal = 0;
        int position = 0;
        // Recorrer la cadena...
        for (int x = binary.length() - 1; x >= 0; x--) {
            // Saber si es 1 o 0; primero asumimos que es 1 y abajo comprobamos
            short digit = 1;
            if (binary.charAt(x) == '0') {
                digit = 0;
            }

      /*
          Se multiplica el dígito por 2 elevado a la potencia
          según la posición; comenzando en 0, luego 1 y así
          sucesivamente
       */
            double multiplier = Math.pow(2, position);
            decimal += digit * multiplier;
            position++;
        }
        return decimal;
    }

    public static String decimalToBinary(int decimal) {
        if (decimal <= 0) {
            return "0";
        }
        String binary = "";
        while (decimal > 0) {
            short remainder = (short) (decimal % 2);
            decimal = decimal / 2;
            // Insertar el dígito al inicio de la cadena
            binary = String.valueOf(remainder) + binary;
        }
        return binary;
    }

    public static String binaryToBaseXD(String binaryText) {
        String binary = "";
        String[] binaryNumbers = binaryText.split(" ");
        String v_base_XD_message = "";
        for (String currentBinary : binaryNumbers) {
            int XD = 0;
            int position = 0;
            // Recorrer la cadena...
            for (int x = binary.length() - 1; x >= 0; x--) {
                // Saber si es 1 o 0; primero asumimos que es 1 y abajo comprobamos
                String letter = "X";
                if (binary.charAt(x) == '0') {
                    letter = "D";
                }
                v_base_XD_message += letter;
            }
        }
        return v_base_XD_message;
    }

    public static void p_show_info_program(){
        System.out.println("╔═════════════════════════════════════════════════════════╗");
        System.out.println("║----------------------XD CONVERTER-----------------------║");
        System.out.println("║---------MAKER: Nicolás Andrés Ramírez Calderón----------║");
        System.out.println("║----DESCR: This program turns ASCII in XD expressions----║");
        System.out.println("╚═════════════════════════════════════════════════════════╝");
    }
    }

