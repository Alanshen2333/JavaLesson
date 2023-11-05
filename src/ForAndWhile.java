public class ForAndWhile {
    public static void main(String[] args) {
        int flag = 0, min = 100, max = 0;
        for (int i = 0; i < 10; i++) {
            int a = (int) (100.0 * Math.random());
            if (a < min) {
                min = a;
            }
            if (a > max){
                max = a;
            }
            if(a >50){
                flag++;
            }
        }
        System.out.println(min);System.out.println(max);System.out.println(flag);
    }
}