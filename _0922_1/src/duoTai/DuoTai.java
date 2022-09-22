package duoTai;

public class DuoTai {
    public static void main(String[] args){
        //什么是多态：多态就是父类的引用指向子类的对象
        Animal a=new Person();
        //子类的对象赋值给父类
        //这样可以通过父类的变量实例去调用子类的属性和方法.
        a.canCry();//调用的输出是父类的方法还是子类的呢
        //调用的是子类的方法

        //不能够直接调用子类一些特有的属性和方法。只能够调用父类中存在的属性和方法
        //a.study();
        //想要调用一些子类特有的方法时，就得强制将父类对象实例强制向下转型
        Person p=(Person) a;
        p.Study();

    }

}
