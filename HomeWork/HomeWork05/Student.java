package HomeWork.HomeWork05;

public class Student extends Human implements Study {

    private static int age;

    public static void main(String[] args) {

        //验证实现的setAge
        Student xiaoming = new Student();

        xiaoming.setAge(22);

        //类中静态成员的两种访问方法
        System.out.println(xiaoming.age);
        System.out.println(Student.age);

        //验证实现的read


    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void read() {
        System.out.println("im reading");
    }
}
