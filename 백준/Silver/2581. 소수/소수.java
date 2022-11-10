import java.io.*;

public class Main {
    public static boolean prime[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        prime = new boolean[b+1];
        getPrime();

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i =a; i <= b; i++ ){
            if(!prime[i]){
                sum += i;
                if(i < min){
                    min = i;
                }
            }
        }

        if(sum == 0){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }


    }

    public static void getPrime(){
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i<=Math.sqrt(prime.length); i++){
            for(int j = i * i; j < prime.length; j += i){
                prime[j] = true;
            }
        }
    }
}