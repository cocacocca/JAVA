package TextBookCases;

public class Case4dot1 {
    public static int add(int src, int des){
        return src + des;
    }

    public static void main(String[] args) {
        Case4dot1 count = new Case4dot1();
        int apple1 = 30;
        int apple2 = 20;
        int num = count.add(apple1,apple2);
        System.out.println(num);
    }
}
