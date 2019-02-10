package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SequenceInMatrix {
    private static int currentSequence;

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] input = rd.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        String[][] matrix = new String[n][m];
        for (int i = 0; i < n; i++) {
            String[] input1 = rd.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = input1[j];
            }
        }
        boolean[][] visited = new boolean[n][m];
        System.out.println(getMaxSequence(matrix,visited));

    }

    private static void dfs(int row, int col, String value, String[][] matrix, boolean visited[][]) {

        if (row < 0 || col < 0 || row >= matrix.length || col >= matrix[row].length
                || visited[row][col] || !matrix[row][col].equals(value)) {
            return;
        }
        currentSequence++;
        visited[row][col] = true;
        dfs(row - 1, col, value, matrix, visited);
        dfs(row - 1, col + 1, value, matrix, visited);
        dfs(row, col + 1, value, matrix, visited);
        dfs(row + 1, col + 1, value, matrix, visited);
        dfs(row +1, col, value, matrix, visited);
        dfs(row + 1, col - 1, value, matrix, visited);
        dfs(row, col - 1, value, matrix, visited);
        dfs(row - 1, col - 1, value, matrix, visited);
    }
    private static int getMaxSequence(String[][]matrix,boolean[][]visited){
        int maxSequence=1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (visited[i][j]) {
                    continue;
                }
                dfs(i, j, matrix[i][j], matrix, visited);
                maxSequence = Math.max(maxSequence, currentSequence);

                currentSequence = 0;
            }

        }
        return maxSequence;
    }

}

