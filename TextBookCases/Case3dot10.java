package TextBookCases;

public class Case3dot10 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<10;i++){
            for(j=1;j<i+1;j++){
                System.out.println(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
