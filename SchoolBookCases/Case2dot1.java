package SchoolBookCases;

public class Case2dot1 {
    public static void main(String[] args) {
        //类型转换
        byte a;
        int b = 325;
        double c = 346.73;
        a = (byte)b;
        System.out.println("int->byte:"+b+"->"+a);
        b = (int)c;
        System.out.println("int->byte:"+c+"->"+b);
    }
}
