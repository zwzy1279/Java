package thisCan;

public class People {
    String name;
    int age;
    void cry(){
        System.out.println("人会叫");
    }
    void setterPeople(String name,int age){
        this.name=name;
        this.age=age;//这里的this.name是指当前对象，也就是当前People对象。而这里单单的name是指传进来的形式参数
    }
    String getterName(){
        return name;
    }
    void peopleSay(){
        System.out.println("越努力，越幸运...");
    }
    //定义一个构造器
    public People(){
        //this调用别的构造器
        this(13);//调用下面那个有age参数的构造器
        System.out.println("调用的构造器所显示的age为"+age);
    }
    public People(int age){//构造器的作用
        //构造器能够先自己执行调用
        this.age=age;
        peopleSay();
    }
}
