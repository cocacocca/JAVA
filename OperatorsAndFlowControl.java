public class OperatorsAndFlowControl
{
    public static void main(String[] args) {
        //赋值运算符
        int i = 75;
        long l = i;
        Object object = new Object();

        //算数运算符
        //+ - * / %

        //关系运算符
        //> < == != >= <=

        //逻辑运算符
        //！取反运算
        System.out.println(!true);
        //^异或运算
        System.out.println(true ^ true);//同为true或false为false，否则则为true
        //&&和&逻辑运算
        //只有在简洁与运算符&&左侧为true时，才会运算其右侧的逻辑表达式，否则直接返回运算结果false
        //无论非简洁与运算符&左侧为何值，都要运算其右侧的逻辑表达式，最后返回运算结果
        int x = 7, y = 5;
        System.out.println((x < y) && (x++ == y--));
        System.out.println((x < y) & (x++ == y--));
        //||和|运算符均用于逻辑或运算
        //只有在简洁或运算符||左侧为false时，才会运算其右侧的逻辑表达式；否则直接返回运算结果true
        //无论在非简洁或运算符|左侧为何值，都要运算其右侧的逻辑表达式，最后返回运算结果
        System.out.println((x < y) || (x++ == y--));
        System.out.println((x < y) | (x++ == y--));

        //位运算符
        //~按位取反
        //&按位与
        //|按位或
        //^按位异或

        //对象运算符
        //基本应用形式如下
        //对象标识符 instanceof 类型标识符
        java.util.Date date = new java.util.Date();
        System.out.println(date instanceof java.util.Date);
        System.out.println(date instanceof java.sql.Date);

        //其他运算符
        //++一元运算符，自动递增
        int num1 = 3;
        int num2 = 3;
        int a = 2 + (++num1);
        //--一元运算符，自动递减
        int b = 2 - (--num2);
        //？：三元运算符，根据“？”左侧的逻辑值，决定返回“：”两侧中的一个值
        int store = 12;
        System.out.println(store <= 5 ? "库存不足！" : "库存量：" + store);
        //[]用于声明、建立或访问数组的元素
        //.用于访问类的成员或对象的实例成员

        //if语句
        //if(表达式){
        //  语句序列
        //}

        //if(表达式){
        //  语句序列1;
        ///}else{
        //  语句序列2;
        //}

        //if(表达式1){
        //  语句序列2;
        //}else if(表达式2)
        //  语句序列2;
        //}else{
        //  语句序列n;
        //}

        //switch语句
        //一般形式为
        /*switch(表达式)
        {
           case 常量表达式1:语句序列1
           break;
        }*/

        //for循环语句
        //一般形式为
        //for(初始化语句;循环条件;迭代语句)
        /*{
            语句序列
        }*/

        //while语句是用一个表达式来控制循环的语句
        //一般形式为
        /*
        * while(表达式)
        * {
        *   语句序列
        * }
        * */

        //do……while循环语句，被称为后测试循环语句，使用一个条件来控制是否继续重复执行该语句。
        //一般形式为
        /*
        * do{
        *   语句序列
        * }while(表达式)
        * */

        //for循环语句的嵌套
        /*for(){
            for(){
                语句序列
            }
        }
        * */

        //while循环语句的嵌套
        /*while(){
        *   while(){
        *       语句序列
        *   }
        * }*/

        //do...while循环语句的嵌套
        /*do{
            do{
                语句序列
            }while();
        }while();
        * */

        //for循环语句与while循环语句的嵌套
        /*for(){
            while(){
                语句序列
            }
        }
        */

        //while循环语句与for循环语句的嵌套
        /*while(){
            for(){  
                语句序列
            }
        }*/

        //do...while循环语句与for循环语句的嵌套
        /*do{
            for(){
                语句序列
            }
        }while();
         */

        //break跳转语句终止循环或其他控制结构
        //只要执行到break语句，就会终止循环体的执行。

        //continue跳转语句应用于for、while和do……while等循环语句中。
        //如果在某次循环体的执行过程中执行了continue跳转语句，本次循环就结束了，即不再执行本次循环中continue跳转语句后面的语句，而是进行下一次循环

        //return跳转语句可以从过一个方法中返回，并把控制权交给调用它的语句。
        //return跳转语句通常被放在方法的最后，用于退出当前方法并返回一个值
    }
}
