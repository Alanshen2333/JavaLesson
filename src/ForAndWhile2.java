import java.util.Scanner;

public class ForAndWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean flag = true;
        for (int i = 2; i < 0.5 * a; i++) {
            if (a == 1) {
                flag = false;
            } else if (a % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("素数");
        else System.out.println("不是素数");
    }
}
