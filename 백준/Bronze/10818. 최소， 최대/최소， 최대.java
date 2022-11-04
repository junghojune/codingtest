import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int max = -1000000;
        int min = 1000000;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            int val = Integer.parseInt(st.nextToken());

            if(val > max){
                max = val;
            }

            if(val < min){
                min = val;
            }
        }

        System.out.println(min + " " + max);
    }
}