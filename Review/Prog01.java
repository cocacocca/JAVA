package Review;

public class Prog01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //JAVA11:String.repeat
            System.out.println(" ".repeat(5 - i) + "*".repeat(i));
        }
    }
}
