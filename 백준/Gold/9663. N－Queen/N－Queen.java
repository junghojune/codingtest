import java.io.*;
import java.util.*;

public class Main {

    public static int n;
    public static int[] arr;
    public static int count = 0;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        n = Integer.parseInt(br.readLine());


        arr = new int[n];
        nQueen(0);
        System.out.println(count);
    }

    public static void nQueen(int depth) {
        if(depth == n){
            count++;
            return;
        }

        for(int i = 0; i< n; i++){
            arr[depth] = i;

            if(Possibility(depth)){
                nQueen(depth + 1);
            }
        }
    }

    public static boolean Possibility(int depth){

        for(int i = 0; i < depth; i++){
            if(arr[depth] == arr[i] || Math.abs(arr[depth] - arr[i]) == Math.abs(depth - i)){
                return false;
            }

        }
        return true;
    }
}