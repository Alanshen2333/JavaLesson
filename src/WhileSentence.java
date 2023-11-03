//113,沈凌杰

import java.util.*;

public class WhileSentence {
    public static void main(String[] args) {
        int a = 0, i = 1, s = 0;
        Scanner reader = new Scanner(System.in);
        while (a < 50 | a > 100) //当 a<50 或者 a>100 时执行
        {
            System.out.println("从键盘输入一个 50～100 的整数：");//在屏幕上显示"从键盘输入一个 50～100 的整数："
            a = reader.nextInt();//读入一个整数，并且赋值给 a
        }
        System.out.println("你输入的数是" + a);
        while (i <= a) //当 i 不大于 a 时执行
        {
            s += i; //将 i 累加到 s 上
            i++; //i 自增 1，考虑一下，如果 i 不改变值，循环会不会结束
        }
        System.out.println("1+2+3+…+" + a + "=" + s);
    }
}
