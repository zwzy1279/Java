package thisCan;

public class _this{
    //this的作用是修饰或者调用属性，方法或者构造器
    //this指向当前对象，也就是new出来赋给的值
    public static void main(String[] args){
        People p=new People();
        p.setterPeople("水碧",19);
        System.out.println(p.getterName());
       // People p2=new People(20);
    }
}
