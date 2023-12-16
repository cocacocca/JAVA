package HomeWork.HomeWork04;

public class Human {

    private int age;

    public Human(){
        ;
    }

    //实现this赋初值
    public Human(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Human origin01 = new Human(18);
        System.out.println(origin01.age);


        Human origin02 = new Human();

        //使用setAge给age赋值
        origin02.setAge(19);
        //实例化对象调用
        System.out.println(origin02.getAge());
    }

    private void setAge(int age){
        this.age = age;
    }

    //新建一个成员方法打印age
    public int getAge(){
        return this.age;
    }
}
