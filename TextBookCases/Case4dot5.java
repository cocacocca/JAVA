package TextBookCases;

public class Case4dot5 {
    public static void main(String[] args) {
        FuelTank ft = new FuelTank(100);
        System.out.println("当前油箱的油量是:"+ft.gas);
        Car car = new Car();
        System.out.println("现在开始启动汽车");
        car.run(ft);
        System.out.println("当前油箱的油量是:"+ft.gas);
    }
}

class FuelTank{
    int gas;
    FuelTank(int x){
        gas = x;
    }
}

class Car{
    void run(FuelTank ft){
        ft.gas = ft.gas - 5;
    }
}