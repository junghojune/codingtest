import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[row][col];

        for(int i = 0; i < row; i++){
            StringTokenizer s1 = new StringTokenizer(br.readLine());
            for(int j = 0; j< col;j++){
                arr1[i][j] = Integer.parseInt(s1.nextToken());
            }
        }

        for(int i = 0; i < row; i++){
            StringTokenizer s2 = new StringTokenizer(br.readLine());
            for(int j = 0; j< col;j++){
                int b = arr1[i][j] + Integer.parseInt(s2.nextToken());
                sb.append(b).append(" ");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }


}