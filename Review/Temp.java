package Review;

class Example {
    private int privateVariable;

    public Example(int value) {
        this.privateVariable = value;
    }

    public int getPrivateVariable() {
        return privateVariable;
    }
}

public class Temp {
    public static void main(String[] args) {
        Example exampleObject = new Example(42);

        // 在Main类中，无法直接访问Example类的private变量privateVariable
        // 以下行代码将无法编译通过
//         int value = exampleObject.privateVariable;

        // 但可以通过公共方法间接获取private变量的值
        int retrievedValue = exampleObject.getPrivateVariable();
        System.out.println("Retrieved Value: " + retrievedValue);
    }
}

