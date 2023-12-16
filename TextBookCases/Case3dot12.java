package TextBookCases;

public class Case3dot12 {
    public static void main(String[] args) {
        System.out.println("100以内能被9整除的数为：");
        for(int i=1;i<100;i++){
            if(i%9!=0){
                continue;
            }
            System.out.println(i+" ");
        }
    }
}
