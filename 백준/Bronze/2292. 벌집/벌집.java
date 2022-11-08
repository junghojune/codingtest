import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 6 12 18 24 30
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        // 1 - 1
        // 2 ~ 7 - 2
        // 8 ~ 19 -3
        // 20 ~ 37 - 4
        // 38 ~ 61 - 5
        // ....
        int count = 1;
        int range = 2;

        if(n == 1){
            System.out.println(1);
        }else{
            while(range <= n){
                range += 6 * count;
                count++;
            }

            System.out.println(count);
        }
    }
}