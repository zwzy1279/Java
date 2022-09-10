public class Main {
    public static void main(String[] args) {
        //方法的重载：同一个类中，允许方法名一样，只要他们的参数的类型或者个数不同即可，跟参数的名字无关
        //重载的特点，跟方法名的类型无关，跟权限修饰符，返回值类型，方法体，形参变量名无关，只要比较方法名一样，参数的个数或者类型不一样即可。调用时，根据方法的参数类型或者个数来查找即可。
        //判断重载
        /*
        void show(int a,double b,char c){}构成重载的有：
        void show(int d,double e,char f){}与题目不构成重载，因为参数个数一样，参数类型一样。与参数的名字无关
        void show(int d,char f){}与题目构成重载
        int show(int d,char f){}与题目构成重载。因为跟方法名的类型无关
         */
        /*
        重载习题
        2.编写程序，定义三个重载方法并调用。方法名为mOL。
>三个方法分别接收一个int参数、两个int参数、一个字符串参数。
分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
>在主类的main()方法中分别用参数区别调用三个方法。I
3.定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方法求两个double值中的最大值，第三个方法求三个double值中的最大值，
并分别调用三个方法。
         */
        Test test=new Test();
        int num=test.mOL(2);
        System.out.println("平方值为"+num);
        int num2=test.mOL(2,3);
        System.out.println("相乘为"+num2);
        String ch=test.mOL("love");
        System.out.println("字符串为"+ch);

        /*
        允许直接定义能和多个实参相匹配的形参 void test(String...books)
         */

        test.bookName("红楼梦","三国演义","西游记","水浒传");

        /*
        方法参数的值传递机制
        形参，方法定义声明时的参数
        实参，调用方法时穿进去的参数

        当形参是基本数据类型参数时，实参传进去的参数是数据值给形参
        当形参是引用数据类型参数时，实参传进去的参数是地址值给形参
         */


    }
}