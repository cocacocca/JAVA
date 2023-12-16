package HomeWork.HomeWork02.HumanPackage;


//创建一个包，包中含有一个Human类
public class Human {
        public int stuNum = 202201;
        protected int salary = 5000;
        private int age = 21;

        public int getPriAge(){
            return age;
        }

        public int getProtSalary(){
                return salary;
        }
}
