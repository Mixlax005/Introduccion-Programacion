package usta.fis;

public class Main {

    public static void main(String[] args) {
        float[][] matrix, matrix_filled;
        int columns = 4, rows = 20;
        matrix = new float[columns][rows];
        matrix_filled=grades(matrix, columns, rows);
        for (int j=0; j<rows; j++){
            for (int i=0; i<columns; i++){
                System.out.print(matrix_filled[i][j]+"|");
            }
            System.out.println("");
        }
    }
    public static float [][] grades(float[][] matrix, int columns, int rows){
        float auxiliar;
        for (int i=0; i<columns; i++){
            for (int j=0; j<rows; j++){
                auxiliar= Math.round(Math.random()*15);
                matrix[i][j]= (float) ((auxiliar/10)*3.33);
            }
        }
        return matrix;
    }
}
