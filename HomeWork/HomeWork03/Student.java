package HomeWork.HomeWork03;

public class Student extends Human{

    public Student(){

    }

    public Student(int age){
        super.setAge(age);
    }

    public static void main(String[] args) {

        //在子类中创建age优先使用子类成员
        int age;

        //子类下的age
        Student student02 = new Student();
        student02.setAge(25);

        //父类下的age
        Student student = new Student(60);
        student.printSuperAge();
    }

    @Override
    public void setAge(int age){
        this.age = age;
        System.out.println(age);
    }

    public void printSuperAge(){
        System.out.println(super.age);
    }

}
