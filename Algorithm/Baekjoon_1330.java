package Algorithm;
import java.util.Scanner;
public class Baekjoon_1330 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        in.close();  // 파일을 열고 닫고를 꼭 해줘야 한다.
        String result = (A>B) ? ">" : ((A<B) ? "<" : "==");
        System.out.println(result);
    }
}
