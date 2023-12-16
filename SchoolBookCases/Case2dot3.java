package SchoolBookCases;

import java.util.Scanner;
//根据电量计算缴纳的电费
public class Case2dot3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double count = 0, price = 0;
        System.out.println("请输入电量");
        count = reader.nextDouble();//返回从输入中扫描到的double
        if (count >= 1 && count <= 90)
            price = 0.6 * count;
        if (count >= 91 && count <= 150)
            price = 0.6 * 90 + 1.1 * (count - 90);
        if (count >= 151)
            price = 0.6 * 90 + 1.1 * 60 + 1.7 * (count - 150);
        System.out.println(price);
    }
}
