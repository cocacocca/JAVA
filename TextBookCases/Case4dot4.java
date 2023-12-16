package TextBookCases;


public class Case4dot4 {
    public static void main(String[] args) {
        Point ap = new Point();
        int a = 15;
        int b = 32;
        int sum = ap.add(a,b);
        System.out.println(sum);
    }
}

class Point{
    int add(int x,int y){
        return x + y;
    }
}
