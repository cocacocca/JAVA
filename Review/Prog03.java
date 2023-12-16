package Review;

import java.util.Scanner;

public class Prog03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入成绩：");
        double score = scanner.nextDouble();

        if (score >= 0 && score <= 100) {
            if (score < 60) {
                System.out.println("不及格");
            } else if (score < 70) {
                System.out.println("及格");
            } else if (score < 80) {
                System.out.println("中等");
            } else if (score < 90) {
                System.out.println("良好");
            } else {
                System.out.println("优秀");
            }
        } else {
            System.out.println("成绩无效，应在[0,100]范围内");
        }

        scanner.close();
    }
}
