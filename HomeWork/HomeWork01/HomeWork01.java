package HomeWork.HomeWork01;


public class HomeWork01 {
    public static void main(String[] args) {
        //用空的构造方法实例化一个对象
        Human fireman = new Human();

        ///实例化对象时，可以赋初值
        Human teacher = new Human("law",25);

        //利用拷贝构造实例化一个新对象
        Human student = new Human(teacher);
    }
}

class Human {
    //1.成员变量01
    String name;

    //1.成员变量02
    int age;

    //空的构造方法实例化一个对象
    public Human() {
        ;
    }


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(Human human) {
        this.name = human.name;
        this.age = human.age;
    }
}
