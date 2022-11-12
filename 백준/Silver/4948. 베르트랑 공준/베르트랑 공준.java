import java.io.*;
import java.util.*;

public class Main {
    public static boolean[] arr = new boolean[246913];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        getPrime();

        StringBuilder sb = new StringBuilder();

        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0 ){
                break;
            }
            int count = 0;
            for(int i =n+1; i <= n * 2; i++ ){
                if(!arr[i]){
                    count++;
                }
            }
            sb.append(count).append('\n');

        }

        System.out.println(sb);

    }

    public static void getPrime(){
        // 소수 아니면 true
        arr[0] = arr[1] = true;

        for(int i = 2; i <= Math.sqrt(arr.length); i++){
            if(arr[i]){
                continue;
            }
            for(int j = i*i; j < arr.length; j += i){
                arr[j] = true;
            }
        }
    }

}