package TextBookCases;

public class Case3dot5 {
    public static void main(String[] args) {
        //if……else嵌套实现
        int English = 78;
        if(English>=75)
        {
            if (English>=90)
            {
                System.out.println("优");
            }
            else
            {
                System.out.println("良");
            }
        }
        else
        {
            if(English>=60)
            {
                System.out.println("及格");
            }
            else
            {
                System.out.println("不及格");
            }
        }
    }
}
