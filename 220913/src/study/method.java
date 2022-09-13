package study;

/**
 * @Description: TODO
 * @Author: lmwis
 * @Data: 2022/9/13 5:52 下午
 * @Version: 1.0
 */
public class method {
  public void swap(int a,int b){////当参数是基本数据类型时，传进去的是数据的值，并不会影响地址上的值。而且当这个函数运行完会销毁掉
    int temp=a;
    a=b;
    b=temp;
    //System.out.println("m="+a+",n="+b);
  }
}
