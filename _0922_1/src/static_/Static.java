package static_;

public class Static {
    public static  void main(String[] args){
        /*
    static 可以让修饰变量属性或者方法，然他们都变成静态的，静态的会随类的创建而创建
    创建了同一个类的多个对象，多有的对象共享同一个位置，当改变其中一个属性或方法时，另外一个也会改变
    就好像客厅和租客各自的房间一样
    客厅是静态变量，改变了其他人看到了也是改变后的摸样
    租客各自的房间，是非静态变量，也就是实例变量，改变了自己的房间，其他租客的房间不会因为你房间的改变而自己的房间出现改变
    通过 类.静态方法来调用
     */
         Person p=new Person();
        Person p2=new Person();
        p.canCry();
        p.Study();
        Person.canCry();
        //Person.Study();
    }
}
