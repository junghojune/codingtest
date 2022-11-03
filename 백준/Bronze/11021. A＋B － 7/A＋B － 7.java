import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int count = Integer.parseInt(br.readLine());
        String[] input;
        int a, b;
        for(int i = 0; i< count; i++){
            input = br.readLine().split(" ");
            a = Integer.valueOf(input[0]);
            b = Integer.valueOf(input[1]);
            bw.write("Case #" + (i + 1) + ": " + (a + b) +"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}