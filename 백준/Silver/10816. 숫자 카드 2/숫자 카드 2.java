import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            if(hashMap.containsKey(num)){
                hashMap.put(num, hashMap.get(num) + 1);
            }else{
                hashMap.put(num, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<m; i++){
            int check = Integer.parseInt(st.nextToken());
            if(hashMap.containsKey(check)){
                sb.append(hashMap.get(check)).append(" ");
            }else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);

    }

}