import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        StringTokenizer stArr = new StringTokenizer(br.readLine()   );
        for(int i = 0; i< N; i++){
            int value = Integer.parseInt(stArr.nextToken());

            if(x > value){
                sb.append(value).append(" ");
            }
        }

        System.out.println(sb);
    }
}