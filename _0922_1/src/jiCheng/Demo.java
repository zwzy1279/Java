package jiCheng;

public class Demo {
    public static void main(String[] args){
        //创建子类的对象
        Person p=new Person(18);
        //p.name="张三";
        p.age=23;
        p.canCry();
        System.out.println(p.name+","+p.age);
        p.canCry();
        //super.canCry();
    }
}
