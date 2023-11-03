//113,沈凌杰
//怎么int还能溢出的，受不了了
public class Factorial {
    public static void main(String[] args) {
        long count = 0;
        for(int i = 0;i<=100;i++){
            long tmp = 1;
            for(int j = 1;j <=i; j++){
                tmp = tmp * j;
            }
            count =tmp + count;
        }
        System.out.println(count);
    }
}
