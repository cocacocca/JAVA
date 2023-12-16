package SchoolBookCases;

public class Case3dot2 {
    public static void main(String[] args) {
        Var v1 = new Var();
        Var v2 = new Var();
        v1.Print();
        v2.Print();
    }
}

class Var{
    static int a = 1;
    int b = 1;
    public void Print(){
        int c = 1;
        ++a;
        ++b;
        ++c;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
}