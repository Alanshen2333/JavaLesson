public class Factorial2 {
    public static void main(String[] args) {
        System.out.println(factorial(2));
        System.out.println(factorial(4));
        System.out.println(factorial(6));
        System.out.println(factorial(8));
        System.out.println(factorial(10));
    }
    public static int factorial(int a){
        int c = 1;
        for(int i = 1;i<=a;i++){
              c = c * i;
        }
        return(c);
    }
}
