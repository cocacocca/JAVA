package TextBookCases;

public class Case3dot6 {
    public static void main(String[] args) {
        int x=5,y=7;
        switch(x*y)
        {
            case 10 :
                System.out.println("10");
                break;
            case 20 :
                System.out.println("20");
                break;
            case 30 :
                System.out.println("30");
                break;
            default:
                System.out.println("以上没有匹配的");
        }

        /*
        可以写成
        case 10 -> System.out.println("10");
        case 20 -> System.out.println("20");
        case 30 -> System.out.println("30");
        default -> System.out.println("以上没有匹配的");
         */
    }
}
