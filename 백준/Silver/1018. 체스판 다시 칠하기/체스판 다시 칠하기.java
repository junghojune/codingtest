import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static boolean[][] arr;
    static int min = 64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new boolean[n][m];

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            for(int j = 0; j<m; j++){
                if(str.charAt(j) == 'W'){
                    arr[i][j] = true; // white = true
                }else {
                    arr[i][j] = false;
                }
            }
        }

        int nRow = n - 7;
        int mRow = m - 7;

        for(int i = 0; i < nRow; i++){
            for(int j = 0; j < mRow; j++){
                find(i,j);
            }
        }

        System.out.println(min);
    }

    public static void find(int x, int y){
        int endx = x + 8;
        int endy = y + 8;
        int count = 0;

        boolean TF = arr[x][y];

        for(int i = x; i < endx; i++){
            for(int j = y; j < endy; j++){
                if(arr[i][j] != TF){
                    count++;
                }

                TF = !TF;
            }
            TF = !TF;
        }

        count = Math.min(count, 64 - count);

        min = Math.min(min, count);
    }
}