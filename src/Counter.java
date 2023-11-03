import java.util.Scanner;

//113,沈凌杰
public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = scanner.next();
        int length = s.length();
        int letter = 0,figure = 0,other = 0;
        for(int i = 0;i < length;i ++){
            char tmp = s.charAt(i);
            if(Character.isLetter(tmp)){
                letter+=1;
            } else if (Character.isDigit(tmp)) {
                figure+=1;
            }
            else{other +=1;}
        }
        System.out.println("字母的个数为："+letter);
        System.out.println("数字的个数为："+figure);
        System.out.println("其他字符的个数为："+other);
        }
    }

