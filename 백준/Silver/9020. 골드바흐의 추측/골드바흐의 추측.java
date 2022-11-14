import java.io.*;
import java.util.*;

public class Main {
    public static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        getPrime();

        int T = Integer.parseInt(br.readLine());

        while(T --> 0){
            int n = Integer.parseInt(br.readLine());
            int q = n / 2;
            int p = n / 2;

            while(true){

                if(!prime[q] && !prime[p]){
                    sb.append(q).append(' ').append(p).append('\n');
                    break;
                }
                q--;
                p++;
            }
        }
        System.out.println(sb);
    }

    public static void getPrime(){
        // 소수가 아니면 true
        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++){

            if(prime[i]){
                continue;
            }
            for(int j = i*i; j< prime.length; j += i){
                prime[j] = true;
            }
        }
    }
}