package overload;

/**
 * @Description: TODO
 * @Author: lmwis
 * @Data: 2022/9/13 9:01 下午
 * @Version: 1.0
 */
public class Main {


    /*
    封装：隐藏内部的复杂性，只对外公开简单的接口，便与外界调用，从而提高程序的可扩展性
    把该隐藏的隐藏起来，该暴露的暴露出来
    对对象的设置和获取
     */
    //定义一个动物的类，用户不能直接访问到腿的个数
  public static void main(String args[]){
    animal a=new animal();
    a.age=12;
    //a.legs=2;//报错，private声明的只能在该类中使用
    a.setterLegs(5);
   System.out.println( a.getterLegs());
   /*
   四种访问权限的修饰符 private,缺省，protected,public.
   这四种在同一个类中都能够使用。
   同一个保重，private不能使用，其他都可以。
   不同的包的子类只有protected和public能够使用。
   同一个工程只有public能狗使用
    */
  }

  }


