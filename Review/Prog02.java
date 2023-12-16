package Review;

import java.util.Scanner;

public class Prog02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入 m：");
        int m = scanner.nextInt();

        System.out.print("请输入 n：");
        int n = scanner.nextInt();

        System.out.print("请输入 x：");
        int x = scanner.nextInt();

        int count = 0;

        for (int i = m; count < 5 && i <= n; i++) {
            if (i % x == 0 && ++count == 5) {
                System.out.println("第5个 " + x + " 的倍数是：" + i);
            }
        }

        scanner.close();
    }
}
