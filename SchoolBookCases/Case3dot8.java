package SchoolBookCases;

public class Case3dot8 {
    public static void main(String[] args) {
        a father = new a();
        b son = new b();
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

class a{
    int i,j;
    void showij(){
        System.out.println(i+" "+j);
    }
}

class b extends a{
    int k;
    int i,j;
    void showk(){
        System.out.println(k);
    }

    void sum(){
        System.out.println(i+j+k);
    }
}