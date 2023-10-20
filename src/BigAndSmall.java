import java.util.Scanner;
import static java.lang.Math.abs;

//3.4补充实验2
public class BigAndSmall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入数字：");
        float a = scanner.nextFloat();
        if(a==0){
            System.out.println("该数字为0");
        }
        else{
            if(a>0) System.out.println("是正数");
            else {System.out.println("是负数");}
        }
        if (abs(a)<1){System.out.println("小");} else if (a>1000000) {
            System.out.println("大");
        }
    }
}
