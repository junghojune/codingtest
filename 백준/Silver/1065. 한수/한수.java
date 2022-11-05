import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(count(n));
    }

    public static int count(int number) {

        if (number < 100) {
            return number;
        } else {
            int count = 99;

            for (int i = 100; i <= number; i++) {

                int first = i / 100;
                int mid = (i / 10) % 10;
                int last = i % 10;

                if ((first - mid) == (mid - last)) {
                    count++;
                }
            }
            return count;
        }

    }

}