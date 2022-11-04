import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(br.readLine());

        for(int i = 0; i<test; i++){

            int sum = 0;
            int cnt = 0;

            for(byte value : br.readLine().getBytes()){
                if(value == 'O'){
                    cnt++;
                    sum += cnt;
                }
                else {
                    cnt = 0;
                }
            }

            sb.append(sum).append('\n');    
        }

        System.out.println(sb);
    }
}
