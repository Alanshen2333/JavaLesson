import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class ThreeDotTwoPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1;
        int a=0,b=0,c=0,d=0;
        System.out.println("请输入从0到1000范围内的整数：");
        s1 = scanner.next();
        int length = s1.length();
        if(s1.charAt(0)!=0) a = s1.charAt(0) - 48;
        if(length>=2) b = s1.charAt(1) - 48;
        if(length>=3) c = s1.charAt(2) - 48;
        if(length>=4) d = s1.charAt(3) - 48;
        System.out.println(s1+"中所有位的和是"+(a+b+c+d)+".");
    }
}
