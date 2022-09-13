package custruct;

/**
 * @Description: TODO
 * @Author: lmwis
 * @Data: 2022/9/13 9:51 下午
 * @Version: 1.0
 */
public class Main {
  public static void main(String args[]){
    /*
  构造器是什么  权限修饰符+类名（参数列表）{}
  构造器怎么使用
  构造器的特征：跟类同名
              不声明返回值类型
              不能有return返回值语句，不能被static final修饰
              一个类中多个构造器形成重载
              一旦显示定义类构造器之后，系统不再提供空的构造器
              一个类中，至少有一个构造器，没有显示的构造器话，系统会默认提供一个空参的构造器
  构造器有什么作用：创建对象用，之前创建对象已经有默认的构造器在运行了 Person p=new Person();Person p=new+构造器；
                 给对象初始化Person p=new Person("Peter",15);

  创建对象本质上就是new+构造器
   */
    //在person类中添加构造器，通过构造器设置所有人的age都为18
    Person p=new Person();
    //p.setterAge(18);
    //System.out.println(p.getterAge());
    Person p1=new Person(14);
    System.out.println(p1.age);
//    p1.setterAge(18);
//    System.out.println(p1.getterAge());

    /*
    属性赋值先后顺序
    默认初始化，显示初始化，构造器赋值，通过对象.方法或者对象.属性方法，
    先顺序为1-2-3-4
     */
  }
}
class Person {
  int age;
    public void setterAge(int i){
    age=i;
  }
  public int getterAge(){
    return age;
  }
  public Person(){
    System.out.println("123");
  }
  public Person(int i){
    age=i;
  }
}

