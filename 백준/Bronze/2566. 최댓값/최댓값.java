import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;
        int arr1 = 0, arr2 = 0;
        for(int i = 0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                int a = Integer.parseInt(st.nextToken());
                if (a > max) {
                    arr1 = i + 1;
                    arr2 = j + 1;
                    max = a;
                }
            }
        }
        System.out.println(max);
        System.out.println(arr1 + " " + arr2);
    }
}