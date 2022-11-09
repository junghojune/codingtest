import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int[][] arr = new int[15][15];

        for(int i =0; i < 15; i++){
            arr[0][i] = i;
            arr[i][1] = 1;
        }

        for(int k = 1; k<15; k++){
            for(int j = 2; j < 15; j++){
                arr[k][j] = arr[k][j-1] + arr[k-1][j];
            }
        }
        int testCount = Integer.parseInt(br.readLine());

        for(int i = 0; i<testCount; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            sb.append(arr[k][n]).append('\n');
        }

        System.out.println(sb);
    }
}