package SchoolBookCases;

public class Case3dot9 {
    public static void main(String[] args) {
        c father = new c();
        d son = new d();
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

class c{
    int i,j;
    void showij(){
        System.out.println(i+" "+j);
    }
}

class d extends c{
    int k;
    int i,j;
    void showk(){
        System.out.println(k);
    }

    void sum(){
        System.out.println(i+j+k);
    }

    void showij(){
        System.out.println(i+" "+j);
    }
}