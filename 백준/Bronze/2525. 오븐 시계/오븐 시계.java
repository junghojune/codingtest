import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int need = sc.nextInt();

        if(m + need >= 60){
            h += (m + need) / 60;
            if(h >= 24){
                h -= 24;
            }
        }
        m = (m + need) % 60;
        System.out.println(h + " " + m);
    }
}