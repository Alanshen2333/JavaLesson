public class hexToDec {
    public static int hex(String a ){
        return Integer.parseUnsignedInt(a,16);
    }
    public static void main(String[] args) {
        System.out.println(hex("D"));
    }
}
