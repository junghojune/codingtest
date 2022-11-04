import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Double arr[] = new Double[N];

        StringTokenizer st = new StringTokenizer(br.readLine());


        for(int i = 0; i< arr.length; i++){
            arr[i] = Double.parseDouble(st.nextToken());
        }

        double sum = 0;
        Arrays.sort(arr);

        for(int i = 0; i<arr.length; i++){
            sum += (arr[i] / arr[arr.length -1]) * 100;
        }

        System.out.println(sum / N);
    }
}