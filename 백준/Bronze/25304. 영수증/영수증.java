import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int a = sc.nextInt();
        int checkPrice = 0;
        for(int i = 0; i < a; i++){
            int price = sc.nextInt();
            int b = sc.nextInt();
            checkPrice += price * b;
        }

        System.out.println(total == checkPrice ? "Yes" : "No");

    }
}