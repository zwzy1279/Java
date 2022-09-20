package practice;

public class Girl {
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
    public void marry(Boy boy){
        System.out.println(getterName()+":我想嫁给"+boy.getterName());
        //再调用boy的getName
        boy.marry(this);//当前Girl这个对象
    }
}
