package TextBookCases;

public class Case3dot2
{
    public static void main(String[] args)
    {
        //移位运算符
        //<<左移，低位添0补齐
        //>>右移，高位添符号位
        //>>>无符号右移，高位添0补齐
        //运算过程将左侧数字转移为二进制计算
        int a = -2 << 3;
        int c = 15 >> 2;
        int e = 4 >>> 2;
        int f = -5 >>> 1;
    }
}
