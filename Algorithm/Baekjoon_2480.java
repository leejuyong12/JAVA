package Algorithm;
import java.util.Scanner;

public class Baekjoon_2480 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int result = 0;
        if (A == B && B == C){
            result = 10000 + A*1000;
        } else {
            if (A == B || A == C){
                result = 1000 + A * 100;
            } else if (B == C){
                result = 1000 + B * 100;
            } else if (A != B && B != C && A != C){
                if (A > B){
                    if (C > A){
                        result = 100 * C;
                    } else{
                        result = 100 * A;
                    }
                } else {
                    if (C > B) {
                        result = 100 * C;
                    } else {
                        result = 100 * B;
                    }
                }
            }
        }
        System.out.println(result);
    }

}
