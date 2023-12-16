package SchoolBookCases;

import java.util.*;
//使用switch语句判断输入数字是星期几
public class Case2dot5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入1~7的整数");
        int day = input.nextInt();
        switch (day) {
            case 7:
                System.out.println("星期日");
                break;
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            default:
                System.out.println("你输入的日期不在有效范围内");
        }
    }
}
