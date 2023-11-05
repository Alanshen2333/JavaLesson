//114,沈凌杰
import java.util.Scanner;

public class FigureTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt(),count = 0;
        for(int i = 0;i<=line;i++){
            for (int j=0;j<=i;j++){
                System.out.print(++count);
                System.out.print('\t');
            }
            System.out.print('\n');
        }
    }
}
