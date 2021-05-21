package usta.fis;
import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int columns=4;
        int rows;
        String execute;
        String [][] matrix;
        String base_rows;
         base_rows=JOptionPane.showInputDialog("This program sorts the people in the bus, " +
                 " \n please type the number of rows in the bus: ");
        rows=Integer.parseInt(base_rows);
         matrix = new String[columns][rows];
         matrix=p_sorter_1(matrix, columns, rows);
         do {
             execute = JOptionPane.showInputDialog(" This is the seat sorting, when 1 es available, 2 occupied and 0 unavailable " + Arrays.deepToString(matrix) +" \n por favor escriba 1 para ingresar un nuevo pasajero o 0 para salir");
             matrix= p_sorter_2(matrix, columns, rows);
             }
         while (Integer.parseInt(execute)==1);

    }
    public static String[][] p_sorter_1(String [][]matrix, int columns, int rows){
        matrix = new String [columns][rows];
        for (int i=0;i < columns; i++){
            if (i%2==0){
                for (int j=0; j < rows; j++){
                        matrix[i][j]= "D";
                    }
            }
            else {
                for (int j=0; j < rows; j++){
                    matrix[i][j]= "X";
                }
            }
        }
        return matrix;
    }
    public static String [][] p_sorter_2(String [][]matrix, int columns, int rows){
        for (int i=0;i < columns; i++){
            for (int j=0; j < rows; j++){
                if (matrix[i][j].equals("D")){
                    matrix[i][j]="O";
                    return matrix;
                }
            }
        }
        return matrix;
    }
}
