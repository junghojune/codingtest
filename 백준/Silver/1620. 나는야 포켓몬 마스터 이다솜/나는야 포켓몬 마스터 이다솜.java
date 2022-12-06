import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<Integer, String> hm_int = new HashMap<>();
        HashMap<String, Integer> hm_str = new HashMap<>();

        for(int i = 1; i <= n; i++){
            String name = br.readLine();
            hm_str.put(name, i);
            hm_int.put(i, name);
        }

        for(int i = 1; i<=m; i++){
            String s = br.readLine();
            if (isString(s)){
                int number = Integer.parseInt(s);
                sb.append(hm_int.get(number));
            }else {
                sb.append(hm_str.get(s));
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    public static boolean isString(String s){
        try{
            Double.parseDouble(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

}