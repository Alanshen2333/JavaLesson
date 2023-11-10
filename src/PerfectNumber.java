import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (n % i ==0) count+=i;
        }
        if (count == n) System.out.println("是完数");
        else System.out.println("不是完数");
    }
}
