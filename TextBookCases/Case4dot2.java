package TextBookCases;

public class Case4dot2 {
    int num;
    float price;
    Case4dot2 apple;

    public Case4dot2() {
        num = 10;
        price = 8.34f;
    }

    public void main(String[] args) {
        Case4dot2 apple = new Case4dot2();
        System.out.println(apple.num);
        System.out.println(apple.price);
        System.out.println(apple.apple);
    }
}