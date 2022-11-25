import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < m; i++){
            if(search(Integer.parseInt(st.nextToken()))){
                sb.append(1).append(" ");
            }else sb.append(0).append(" ");
        }
        System.out.println(sb);
    }

    public static boolean search(int target){
        int left = 0;
        int right = arr.length -1;
        int mid;

        while(left <= right){
            mid = (left + right) / 2 ;
            if(arr[mid] > target){
                right = mid -1;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else {
                return true;
            }
        }

        return false;
    }
}