import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        String a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.next();
        switch (a) {
            case "A":
                System.out.println("优秀");
                break;
            // case "B", "C" :
            // System.out.println("良好");
            // break;
            case "D":
                System.out.println("及格");
                break;
            case "E":
                System.out.println("不及格");
                break;
        }
    }
}
