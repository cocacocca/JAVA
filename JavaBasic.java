import java.util.List;

public class JavaBasic
{
    public static void main(String[] args)
    {
        //常量
        //具体形式：final 常量类型 常量标识符;
        final int YOUTH_AGE = 18;//声明一个int型常量并初始化为18
        final float PIE = 3.14F;//声明一个float型常量并初始化为3.14，float型常量需要在数值后面加上字母”F“或”f“，说明类型
        final int A = 1, B = 2, C = 3;

        //变量
        //具体形式：变量类型 变量标识符;
        String name = "MWQ";//声明一个String型变量并初始化为MWQ
        int partyMemberAge = 26;//声明一个int型变量并初始化为26

        //常量与变量的区别为，变量的值允许被改变

        //基本数据类型
        //整数型
        //整数型包括字节型（byte）、短整型（short）、整形（int）和长整型（long）
        byte b = 12;//-128~127
        short s = 7123;//-32768~32767
        int i = 3123123;//-2147483648~2147483647
        long lc = 1981981918;//赋值如果超出int型的取值范围，必须加上l，若未超出可不加

        //浮点类型
        float fa = 98.7984f;//所复制为小数，必须加上字母”f“，若未超出可不加
        double da = 9445.4556d;//所复制为小数可不加
        //Java默认小数为double型

        //字符类型
        char character = 99;
        char ca = 'M';//所赋值为单个符号才需要加c

        //布尔类型
        boolean d = true;
        boolean e = false;

        //引用数据类型包括类引用、接口引用和数组引用
        Object object = null;//声明一个java.lang.Object类的引用
        List list = null;//声明一个java.util.List类的引用
        int[] months = null;//声明一个int型数组的引用
        System.out.println("Object is " + object);//输出类引用object
        System.out.println("List is " + list);//输出接口引用list
        System.out.println("months is " + months);//输出数组引用months


        //声明一维数组的方式如下：
        //数组类型[] 数组标识符;
        //数组类型 数组标识符[];
        int[] monthes;
        boolean members[];

        //声明二维数组的方式如下：
        //数组类型[][] 数组标识符
        //数组类型 数组标识符[][];
        int[][] days;
        boolean holidays[][];

        //创建数组
        int[] mouth = new int[12];
        int[][] day = new int[2][3];

        //初始化数组
        int boy[] = {2,3,4,5,6};
        //等价于
        int boys[] = new int[5];

        boolean holiday[][] = {{true, false, true}, {false, true, false}};

        //获取数组长度
        System.out.println(months.length);
        //如果创建的数组为
        boolean holi[][] = {
                {true, false, true},
                {false, true, false},
                {true, false, true}
        };
        //则根据具体行列号获取
    }
}
