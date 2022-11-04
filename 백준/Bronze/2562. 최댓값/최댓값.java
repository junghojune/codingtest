import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int count = 0;
        for (int i = 1; i < 10; i++) {
            int val = Integer.parseInt(br.readLine());

            if (val > max) {
                max = val;
                count = i;
            }
        }

        System.out.println(max);
        System.out.println(count);
    }
}