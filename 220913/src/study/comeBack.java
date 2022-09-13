package study;

/**
 * @Description: TODO
 * @Author: lmwis
 * @Data: 2022/9/13 10:09 上午
 * @Version: 1.0
 */
public class comeBack {
  /*
  递归:一个方法内调用他本身
   */
  public static void main(String args[]){
    //计算1-100之间的自然数之和，用递归的方法
    comeBack c=new comeBack();
    int result=c.sum(100);
    System.out.println(result);//5050
    int result2=c.feiBoSum(6);
    System.out.println(result2);//8
    int result3=c.question3(10);
    System.out.println(result3);//10497
  }
  public int sum(int i) {
    if(i == 1) {
      return i;
    }
    else{
      return sum(i-1)+i;
    }
  }
  //计算1-100之间的自然数之积，用递归的方法：将上述的+变成*
  //斐波那契数列，一个数等于前两个数之和 f(n)=f(n-1)+f(n-2),再是和的算法,求第六个数是多少 8
  //1 1 2 3 5 8
  public int feiBoSum(int i){//i为第几个数
    if(i==1){
    return i;
  }
    else if(i==2){
      return i-1;
    }
    else{
      return feiBoSum(i-1)+feiBoSum(i-2);
    }
  }
  //已知有一个数列，f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),求f(10)
  public int question3(int i){
    if(i==0){
      return i+1;
    }
    else if(i==1){
      return i+3;
    }
    else{
      return 2*question3(i-1)+question3(i-2);
    }
  }
}
