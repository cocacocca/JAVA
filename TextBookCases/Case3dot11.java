package TextBookCases;

public class Case3dot11 {
    public static void main(String[] args) {
        System.out.println("10以内的素数为");
        int i,j;
        for(i=1;i<=10;i++){
            for(j=2;j<=i/2;j++){
                if(i%j==0)
                    break;
            }
            if(j>i/2)
                System.out.println(i+" ");
        }
    }
}
