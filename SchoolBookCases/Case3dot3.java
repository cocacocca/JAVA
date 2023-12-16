package SchoolBookCases;

public class Case3dot3{
    static double d;

    public static void main(String[] args) {
        int i;
        Case3dot3 ob = new Case3dot3();
        i=5;
        ob.changeInt(i);
        System.out.println(i);
        ob.d=6.25;
        ob.changeDouble(ob);
        System.out.println(d);
    }

    public static void changeInt(int v){
        v=10;
    }

    public static void changeDouble(Case3dot3 ref){
        ref.d=10.5;
    }
}