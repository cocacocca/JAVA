package SchoolBookCases;
//while语句求1~100之间的和
public class Case2dot6 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i<=100)
        {
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
