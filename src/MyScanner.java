import java.util.Scanner;

public class MyScanner {
    public static void main(String[] arg){
        Scanner newScanner = new Scanner(System.in);
        int a;float b;double c;String s;
        System.out.print("从键盘输入一串字符");
        s=newScanner.nextLine();
        System.out.println("你输入的字符串是："+s);
        a= newScanner.nextInt();
        System.out.println("你输入的整数是："+a);
        System.out.print("从键盘输入一串浮点数：");
        b= newScanner.nextFloat();
    }
}
