package Review;

class Human {
    private int age;

    public Human() {
    }

    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Prog06 extends Human {
    public Prog06(int age) {
        super(age);
    }

    public static void main(String[] args) {
        Prog06 student = new Prog06(20);
        System.out.println("父类的age：" + student.getAge());
    }
}