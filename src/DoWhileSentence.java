public class DoWhileSentence {
    public static void main(String[] args) {
        int i =100,a = 0;
        do{
            a = a + i--;
        }while (i>0);
        System.out.println("100+99+98+…+2+1="+a);
    }
}
