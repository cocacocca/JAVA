package SchoolBookCases;

import java.util.Arrays;
//一维数组的定义与赋值
//arraycopy(a,num1,b,num2,num3)中，num1：从a的第num1个数开始向后数num3个数字进行复制；num2：从第num2个起对其及后续替换num3个；num3：复制num3个
public class Case2dot11 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,500,600,700,800};
        int[] b,c,d;
        b = new int[8];
        c = new int[8];
        d = new int[8];
        System.out.println(Arrays.toString(a));
        System.arraycopy(a,0,b,0,a.length);
        System.out.println(Arrays.toString(b));
        System.arraycopy(a,0,c,0,4);

        System.out.println(Arrays.toString(c));

        System.arraycopy(a,4,d,0,4);

        System.out.println(Arrays.toString(d));
        c[c.length-1]=-100;
        d[d.length-1]=-200;
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
    }
}
