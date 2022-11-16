import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] origin = new int[n];
        int[] sort = new int[n];
        HashMap<Integer, Integer> ranking = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<n; i++){
            origin[i] = sort[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sort);

        int rank = 0;
        for(int K : sort){
            if(!ranking.containsKey(K)){
                ranking.put(K, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : origin){
            sb.append(ranking.get(key)).append(' ');
        }

        System.out.println(sb);
    }
}