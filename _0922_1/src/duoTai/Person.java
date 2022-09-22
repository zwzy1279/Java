package duoTai;
public class Person extends Animal {
    //继承了父类Animal的所有属性和方法，那么我们在调用他的属性和方法也是可以的

    //而当我们在子类里写了跟父类的方法一样的函数，那么继承后子类输出后不是父类的方法，而是子类自身写的方法。
    //方法一样：方法名一样，参数列表一样
    //相同方法时，子类的方法会覆盖掉父类的方法，俗称重写
    //子类的权限修饰符不能够小于父类的权限修饰符，可以等于或者大于
    void canCry(){
        System.out.println("人会叫。。。");
    }
    void Study(){
        System.out.println("可以学习");
    }
}
