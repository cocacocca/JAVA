package TextBookCases;

public class Case4dot8 {
    public static void main(String[] args) {
        Fruit obj = new Fruit();
        obj.harvest();
    }
}

class Fruit{
    public String color = "green";
    public void harvest(){
        String color = "red";
        System.out.println(color);
        System.out.println(this.color);
    }
}
