import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[2];

        for(int i =0; i<2; i++){
            int v = Integer.parseInt(st.nextToken());
            int hun = v / 100;
            int ten = (v % 100) / 10;
            int one = (v % 10);

            arr[i] = (one * 100) + (ten * 10) + (hun);
        }

        if(arr[0] > arr[1]){
            System.out.println(arr[0]);
        }else {
            System.out.println(arr[1]);
        }
    }
}