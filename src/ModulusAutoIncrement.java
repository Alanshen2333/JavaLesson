public class ModulusAutoIncrement {
    public static void main(String arg[]) {
        int a = 10;
        int b = 6;
        int s = 0;
        s = a % b;
        System.out.println("a % b =" + s);
        a++;
        b--;
        s = ++a + --b;
        System.out.println("a= "+ a);
        System.out.println("b= "+ b);
        System.out.println("s= "+ s);
    }
}
