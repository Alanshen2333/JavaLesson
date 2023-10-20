import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        a = scanner.nextInt();
        System.out.println("请输入第二个整数：");
        b = scanner.nextInt();
        System.out.println("请输入第三个整数：");
        c = scanner.nextInt();
        int max=Math.max(Math.max(a,b),c);
        System.out.println("其中最大的是"+max);
    }
}
