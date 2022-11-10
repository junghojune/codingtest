import java.io.*;

public class Main {
    public static boolean prime[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        for(int i  = 2; i <= Math.sqrt(a); i++){
            while(a % i == 0){
                sb.append(i).append('\n');
                a /= i;
            }
        }

        if(a != 1){
            sb.append(a);
        }

        System.out.println(sb);
    }
}