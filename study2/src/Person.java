public class Person {
    public String name="张林浩";
    public int age;
    public String sex="男";
    public void study(){
       //输出字符串
        System.out.println("abc");
    }
    public void showAge(){
        //显示age值

        System.out.println(age);
        System.out.println("-----------");
    }
    public int addAge(int i){
        //当调用此方法时，给age增加两岁
        age=age+i;
        System.out.println(age);
        return age;
    }

}
