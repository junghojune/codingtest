import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int a,b;
        String[] input;

        while (true){
            input = br.readLine().split(" ");
            a = Integer.valueOf(input[0]);
            b = Integer.valueOf(input[1]);
            if( a + b == 0){
                break;
            }
            bw.write( a + b + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}