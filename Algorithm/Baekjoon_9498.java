package Algorithm;
import java.util.Scanner;

public class Baekjoon_9498 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Score = in.nextInt();
        in.close();
        if (Score >= 90 && Score <= 100) {
            System.out.println("A");
        } else if (Score >= 80) {
            System.out.println("B");
        } else if (Score >= 70) {
            System.out.println("C");
        } else if (Score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
