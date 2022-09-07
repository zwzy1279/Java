public class important {
    /*
    java中有很多个不同功能的类组成，就像一个人由细胞构成
    类冲包含有属性和方法
      属性=成员变量
      方法=成员方法=函数  也就是功能
     */
    public static void main(String args[]){
        /*
        创建类
        创建类的对象
        通过对象.属性，对象.方法来调用对象的结构
         */
        Person person=new Person();//new一个对象，赋给类型为Person的变量，后面通过变量名person操作

        //调用对象的属性和方法
        //调用对象的属性  对象.属性
        //而这里的对象new Person()已经赋值给person,所以我们都通过person操作
        person.age=18;
        person.name="仙女";
        System.out.println(person.name+"今年"+person.age+'岁');

        //调用对象的方法 对象.方法
        String can="Chinese";
        person.isEat();
        person.canLanguage(can);

        //如果创建一个类的多个对象，则每个对象都拥有一套独立的类的属性
        //意味着如果改变一个对象的属性，不会改变其他对象的属性的值

        Person person2=new Person();
        System.out.println(person2.name);//null
        System.out.println(person2.isMale);//false

        Person person3=person;
        //person保存的地址值赋值给person3,导致person和person3指向同一个对象
        System.out.println(person3.age);//18
        person3.age=19;
        System.out.println(person.age);//19

        Test test=new Test();
        test.customer("张总");
        /*
        内存解析
        栈放局部变量
        堆放对象实例
         */
        /*
        局部变量和属性（成员变量）的区别
        相同点：需要声明定义，格式一样
        属性（成员变量）：就是直接在一个类{}中定义的变量
        局部变量：例如在函数中的形式参数。声明在方法中的变量，代码块内，构造器形参，构造器的内部变量
         */
        /*
        关于权限修饰符的区别
        属性：
        权限修饰符：可以在声明属性时，指明其权限
        常用的修饰符：private(只能在自己的类中使用) public protected 缺省（属性类型前没有什么东西）

        局部变量：不能使用权限修饰符
         */
        /*
        默认初始化值：定义好属性之后，拥有默认的初始化值
        属性：整型（int long short byte)0
        布尔型（boolean)false
        浮点型（float double)0.0
        字符型（char)0  \u0000

        引用数据类型（接口 类 数组）null

        局部变量：没有默认初始化值
        意味着我们每次定义局部变量一定要初始化值，赋给他值
        形参调用  函数里的变量都需要赋值
         */
        /*
        在内存加载的位置不同
        属性在堆空间加载
        局部变量在栈空间加载
         */


        /*
        类中方法的声明和使用
        1.如何声明方法
        权限修饰符 返回类型（有具体类型的话，函数体要有return返回值） 方法名（形式参数可有可无）{函数体}

        2.返回值
        方法定义有具体返回类型时，一定要有返回值，返回值一定要是跟返回类型同样的
        方法定义没有具体返回类型（void），返回return;可有可不有
        return的作用用于暂停return后面语句执行

        该不该有返回值以及参数看题目要求或者是凭经验

        3。形参可以有多个
        类型 形参名1，类型 形参名2
         */


    }
}
class Test{
    //直接在类内声明定义的变量
    String name;
    int age;

    public void fun(int number){//函数中的形式参数
         int money;//函数中的变量
    }
    public String customer(String name){
        System.out.println(name);
        return name;
    }
}
//定义一个人的类
class Person{
    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void isEat(){
        System.out.println("可以吃饭");
    }
    public void canLanguage(String language){
        System.out.println("会"+language);
    }
}
//那这个类已经造好了，有什么用啊，怎么用啊
//创建对象，将类实例化

//创建对象
//类型  对象变量名=值
//在主函数中