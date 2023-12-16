package SchoolBookCases;

import java.util.Scanner;
//判断考试分数
public class Case2dot4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩:");
        double score = input.nextDouble();
        if (score >= 90)
            System.out.println("你的成绩等级为：优秀");
        else if (score >= 80)
            System.out.println("你的成绩等级为：良好");
        else if (score >= 70)
            System.out.println("你的成绩等级为：中等");
        else if (score >= 60)
            System.out.println("你的成绩等级为：及格");
        else
            System.out.println("你的成绩等级为：不及格");
    }
}


