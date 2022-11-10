import java.io.*;
import java.util.*;

public class Main {
    public static boolean prime[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        prime = new boolean[b+1];
        getPrime();

        for(int i = a; i <= b; i++){
            if(!prime[i]){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static void getPrime(){
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i<=Math.sqrt(prime.length); i++){
            if(prime[i]) continue;
            for(int j = i* i; j< prime.length; j += i){
                prime[j] = true;
            }
        }
    }
}