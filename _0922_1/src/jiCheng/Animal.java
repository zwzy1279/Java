package jiCheng;

public class Animal {
    //动物作为人的父类
    String name="小狗";
    int age;
    void canCry(){//会叫
        System.out.println("动物会叫。。。");
    }
    Animal(){

    }
    Animal(String name){
        this.name=name;
    }

}
