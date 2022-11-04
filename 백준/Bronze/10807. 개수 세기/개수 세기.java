import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int want = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int cnt = 0;
        
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int k : arr){
            if(k == want){
                cnt++;
            }
        }

        System.out.println(cnt);
        

    }
}