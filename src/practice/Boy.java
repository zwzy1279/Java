package practice;

public class Boy {
    private String name;
    private int age;
    public void setterName(String name){
        this.name=name;
    }
    public String getterName(){
        return name;
    }
    public void setterAge(int age){
        this.age=age;
    }
    public int getterAge(){
        return age;
    }
    //Girl girl=new Girl();
    public void marry(Girl girl){//形式参数：一个Girl类型的变量girl
        System.out.println(getterName()+":我想娶"+girl.getterName());
    }
}
