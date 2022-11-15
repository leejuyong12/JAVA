package Algorithm;
import java.util.Scanner;
public class Baekjoon_2525 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        int min = B + C;
        if (min >= 60){
            int x = min / 60;
            A += x;
            min -= (x * 60);
            if (A >= 24){
                A -= 24;
            }
        }
        System.out.println(A + " " + min);
    }
}
