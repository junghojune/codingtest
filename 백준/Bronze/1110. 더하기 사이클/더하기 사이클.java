import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int copy = n;

        while(true){
            n = ((n % 10) *10 ) + (((n/10) + (n%10)) % 10);
            count++;

            if(n == copy ) {
                break;
            }
        }
        System.out.println(count);
        

    }
}