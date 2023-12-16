package SchoolBookCases;
//使用break语句输出break以前的数字，并输出中断循环的数字
public class Case2dot9 {
    public static void main(String[] args) {
        int count;
        for (count = 1; count <=10; count++) {
            if (count == 5)
                break;
            System.out.println(count);
        }
        System.out.println("循环中断的数是：" + count);
    }
}
