import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        // -4000 ~ 4000
        int[] arr = new int[8001];

        int sum = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int median = 10000; // 중앙값
        int mode = 10000; // 최빈값

        for(int i = 0; i<n; i++){
            int value = Integer.parseInt(br.readLine());
            sum += value;
            arr[value + 4000]++;

            if(value > max){
                max = value;
            }
            if(value < min){
                min = value;
            }

        }

        int count = 0;
        int mode_max = 0;

        boolean flag = false;

        for(int i = min + 4000; i <= max + 4000; i++){
            if(arr[i] > 0){

                if(count < (n + 1) / 2){
                    count += arr[i];
                    median = i - 4000;
                }

                if(mode_max < arr[i]) {
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag = true;	// 첫 등장이므로 true 로 변경
                }

                // 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우
                else if(mode_max == arr[i] && flag == true) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }

        sb.append((int) Math.round((double) sum / n))
                .append('\n')
                .append(median)
                .append('\n')
                .append(mode)
                .append('\n')
                .append(max - min);
        System.out.println(sb);
    }
}