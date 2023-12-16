package SchoolBookCases;
//使用contiune语句跳过指定数字
public class Case2dot10 {
    public static void main(String[] args) {
        int count;
        for (count = 1; count <= 10; count++){
            if (count == 5)
                continue;
            System.out.println(count);
        }
        System.out.println("循环中断的数是："+count);
    }
}
