package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SpiralMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        byte n = Byte.parseByte(rd.readLine());
        short counter = 1;
        byte startRow = 0;
        byte startCol = 0;
        int endRow = n - 1;
        int endCol = n - 1;
        short[][] matrix = new short[n][n];

        while (counter <= n * n) {
            if(startRow==endRow||startCol==endCol){
                matrix[startRow][startCol]=counter;
                break;
            }
            for (byte i = startCol; i < endCol; i++) {
                matrix[startRow][i] = counter++;
            }

            for (byte i = startRow; i < endRow; i++) {
                matrix[i][endCol] = counter++;
            }

            for (int i = endCol; i > startCol; i--) {
                matrix[endRow][i] = counter++;
            }
            for (int i = endRow; i > startRow; i--) {
                matrix[i][startCol] = counter++;
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        for (byte i = 0; i < n; i++) {
            for (byte j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }


}
