//2.5 沈凌杰

public class Conver {
    public static void main(String[] args) {
        byte a = 0;
        short b = 0;
        int c = 0;
        long d = 0;
        float e = 0F;
        double f = 0D;
        String s="10";

        a = Byte.parseByte(s);
        b = Short.parseShort(s);
        c = Integer.parseInt(s);
        d = Long.parseLong(s);
        e = Float.parseFloat(s);
        f = Double.parseDouble(s);
    }
}
