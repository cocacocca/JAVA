package SchoolBookCases;
//用do...while语句求1~100的和
public class Case2dot7 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do {
            sum+=i;
            i++;
        }while (i<=100);
        System.out.println(sum);
    }
}
