import java.util.Scanner;

public class ThreeDotTwoP {
    public static void main(String[] args) {
        long year,day;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入分钟的数量：");
        long min = scanner.nextLong();
        year = min/525600;
        day = year%min/1440;
        System.out.println(min+"分钟等于"+year+"年加"+day+"天。");
    }
}
