package study;

/**
 * @Description: TODO
 * @Author: lmwis
 * @Data: 2022/9/13 8:11 下午
 * @Version: 1.0
 */
public class returnValue {
  public static void main(String args[]){
    returnValue a=new returnValue();
    a.r=2;
    System.out.println(a.findArea());
  }
  double r;
  public double findArea(){
    return Math.PI*r*r;
  }

}


