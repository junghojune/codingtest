import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,1,2,2,2,8};
        int[] need = new int[6];

        for(int i = 0; i< arr.length; i++){
            int a = sc.nextInt();
            need[i] = arr[i] - a;
        }
        sc.close();
        for (int i : need) {
            System.out.print(i + " ");
        }
    }
}