package SchoolBookCases;

public class Case3dot7 {
    public static void main(String[] args) {
        A father = new A();
        B son = new B();
        father.i = 10;
        father.j = 20;
        father.showij();
        son.i = 7;
        son.j = 8;
        son.k = 9;
        son.showij();
        son.showk();
        son.sum();
    }
}

class A{
    int i,j;
    void showij(){
        System.out.println(i+" "+j);
    }
}

class B extends A{
    int k;
    void showk(){
        System.out.println(k);
    }

    void sum(){
        System.out.println(i+j+k);
    }
}