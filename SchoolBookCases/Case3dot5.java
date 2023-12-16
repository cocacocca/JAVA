package SchoolBookCases;

public class Case3dot5 {
    public static void main(String[] args) {
        Intsort s = new Intsort();
        System.out.println(s.sort(1,2));
        System.out.println(s.sort(1,2,3));

    }
}

class Intsort{
    public String sort(int a,int b){
        if(a>b)
            return a+" "+b;
        else
            return b+" "+a;
    }

    public String sort(int a,int b,int c){
        int swap;
        if (a<b) {
            swap=a;
            a=b;
            b=swap;
        }
        if (a<c){
            swap=a;
            a=c;
            c=swap;
        }
        if (b<c){
            swap=b;
            b=c;
            c=swap;
        }
        return a+" "+b+" "+c;
    }
}