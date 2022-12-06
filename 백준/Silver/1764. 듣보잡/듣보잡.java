import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<String> hashSet = new HashSet<>();

        for(int i = 0; i < n; i++){
            hashSet.add(br.readLine());
        }

        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i<m; i++){
            String s = br.readLine();
            if(hashSet.contains(s)){
                list.add(s);
            }
        }

        Collections.sort(list);
        sb.append(list.size()).append("\n");
        for(String s : list){
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }

}