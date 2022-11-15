import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int students = Integer.parseInt(st.nextToken());
        int priceNum = Integer.parseInt(st.nextToken());

        int[] arr = new int[students];
        st = new StringTokenizer(br.readLine());
        for(int i =0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        System.out.println(arr[students - priceNum]);
    }
}