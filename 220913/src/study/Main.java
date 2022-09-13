package study;

/**
 * @Description: TODO
 * @Author: lmwis
 * @Data: 2022/9/13 9:59 上午
 * @Version: 1.0
 */
public class Main {
  public static void main(String args[]){
/*
实参和形参，实参是在调用方法时传进去的参数，形参是在声明时的参数
值传递机制：
方法中参数的传递，当参数是基本数据类型时，传进去的是数据的值。
当参数是引用数据类型时，传进去的是数据的地址值
 */
    int m=1;
    int n=2;
    System.out.println("m="+m+",n="+n);
    method me=new method();
    me.swap(m,n);//当参数是基本数据类型时，传进去的是数据的值，并不会影响地址上的值。而且当这个函数运行完会销毁掉
    System.out.println("m="+m+",n="+n);

    ValueTest2 vt2=new ValueTest2();
    vt2.a=10;
    vt2.b=20;
    System.out.println("a="+vt2.a+",b="+vt2.b);
    swap2(vt2);//当参数是引用数据类型时，传进去的是数据的地址值
    System.out.println("a="+vt2.a+",b="+vt2.b);
  }
  public static void swap2(ValueTest2 vt2){//当参数是引用数据类型时，传进去的是数据的地址值
     int temp=vt2.a;
     vt2.a=vt2.b;
     vt2.b=temp;
  }
  /*
  方法参数的传递内存画图；例题
  栈空间：局部变量
          定义在函数中的变量，或者方法中的参数
  堆空间：new定义的对象，对象中的属性（成员变量）
   */
  /*
  成员变量在类中，在方法外
  局部变量在方法中  方法形参 构造器内 构造器形参 代码块内
   */
}
