package overload;

/**
 * @Description: TODO
 * @Author: lmwis
 * @Data: 2022/9/13 9:01 下午
 * @Version: 1.0
 */
public class animal {
  private int legs;
  public int age;
  public void setterLegs(int i){
    if(i==0||i%2!=0){
      System.out.println("您输入的腿数是不合法的");
    }
    else{
      legs=i;
    }
  }
  public int getterLegs(){
    return legs;
  }
}
