package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class RazpryskvaneNaKonq {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        int m = Integer.parseInt(rd.readLine());
        int r = Integer.parseInt(rd.readLine());
        int c = Integer.parseInt(rd.readLine());
        int[][]matrix=new int[n][m];
        boolean [][] visited=new boolean[n][m];
        matrix[r][c]=1;
        visited[r][c]=true;
        RazpryskvaneNaKonq raz=new RazpryskvaneNaKonq();
        raz.bfs(matrix,r,c,visited);
        for (int i = 0; i < n; i++) {
            System.out.println(matrix[i][m/2]);
        }

    }

    private void bfs(int[][] matrix, int row, int col, boolean[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {-1, 1, 2, -2, 2, -2, -1, 1};
        int[]start={row,col};
        queue.add(start);
        while (!queue.isEmpty()){
            int[]currentStart=queue.poll();
            row=currentStart[0];
            col=currentStart[1];
            for (int i = 0; i < 8; i++) {
                int newRow=row+dx[i];
                int newCol=col+dy[i];
                if(newRow<0||newCol<0||newRow>=matrix.length
                        ||newCol>=matrix[row].length||visited[newRow][newCol]){
                    continue;
                }
                int []newStart={newRow,newCol};
                queue.offer(newStart);
                matrix[newRow][newCol]=matrix[row][col]+1;
                visited[newRow][newCol]=true;
            }
        }
    }
}
