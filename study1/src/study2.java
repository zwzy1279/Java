import java.util.Scanner;

public class study2 {
    public static void main(String[] args) {
        /*
        //判断一个数是否是素数的算法
//素数也就是一个只能被他本身和1整除的一个数，而我们知道每个数都是能够被它本身和1整除的数
//所以我们判断从2到n-1能够被整除就行
        //break跳出最近的一轮循环，continue跳回表达式，进行下一愣循环
        Scanner in=new Scanner(System.in);
        int isPrime=0;

          System.out.println("请输入一个数");
          int num6=in.nextInt();
          for(int i=2;i<num6;i++){
              if(num6%i==0){
                  //System.out.println("能够被整除，不是一个素数");
                  //当有一个数被这整除了，退出循环，break能够跳出最近一层的循环
                  isPrime=0;
                  System.out.println("能够被整除，不是一个素数");
              }
             if(isPrime==1){
                 System.out.println("不能够被整除，是一个素数");

             }
             else{
                 System.out.println("能够被整除，不是一个素数");
             }

      }*/

        //1角，，5角凑出10元的算法，暴力枚举，一个一个试


        /*
        逻辑运算符优先级
         ！>&& >｜｜
         !done&&(1>2)  先算！done
         */

        //求和算法  正负数  分数
        //求1-2+3-4+5-6
       /* int num;
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(i%2!=0){
                sum=sum+i;
            }
            else{
                sum=sum+(-i);
            }
        }
        System.out.println("sum="+sum);*/

        //计算1+1/3+1/5+1/7+1/2n-1
        /*int num2;
        int result=0;
        Scanner in=new Scanner(System.in);
        num2=in.nextInt();
        for(int i=1;i<num2;i++){
            result=result+1/(2*i-1);
        }
        System.out.println(result);*/

        //求最大公约数 12 16 4 能够被各自整除的最大一个数
        /*System.out.println("请分别输入两个数：");
        int a=1;
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();

        for(int i=2;i<=n1&&i<=n2;i++){
            if(n1%i==0&&n2%i==0){
               // System.out.println(i);
                //如何输出一个实时最大的数呢
                a=i;
            }
        }
        System.out.println(a);*/

        //输入所有数，求出平均数，求出数组中每个数高于平均数的值
       /* int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int sum=0;
        int j=0;
        int average;
        int[] number=new int[100];
        while(n!=-1){
            number[j]=n;
            sum=sum+n;
            j++;
            n=in.nextInt();
        }

        for(int i=0;i<=j;i++){
            if(number[i]>(sum/j)){
                System.out.println("平均数是"+sum/j+",高于平均数的值有"+number[i]);
            }
        }*/

        //定义数组 类型[]名字=new 类型[元素个数],元素个数可以是变量
       // int[] price=new int[10];//所有数组中的元素都是定义的同一个类型，数组下表都是从0开始
        //直接初始化数组
       // int[] score={100,98,94,89};
//数组变量是数组的管理者，而不是数组本身，数组必须创建出来然后交给数组变量管理
        //数组之间的变量赋值是管理权限的赋予
        boolean gg=false;
        //for each
        //for(<类型><变量>:<数组>)

        //矩阵算法，井字棋
        //将小写字母转为大写字母的算法
        char ch1='a';
        char ch2=(char)(ch1+'A'-'a');
      System.out.println(ch2);
      /*
      逃逸字符
      \t退到下一个制表位   \b \n \r \\ \' \" \n

      数学
      求绝对值  Math.abs(数字)
      四舍五入   Math.round()
      随机生成数字  Math.random()
      幂 Math.pow(2,3)

      字符串变量
      String s;
      //String是一个类，他的变量像数组变量一样只是他的管理者而已，不是所有者
      String s=new String("abcd");//创建一个String对象，初始化值abcd，让变量s来管理

      函数
      什么是函数，函数是一块代码，接收零个或者多个参数
      做一件事情，并返回零个或者多个值
      //public static void sum(int a,int b){}
      函数名为sum 返回类型为void

      函数的返回
      return 用于停止函数的执行，并返回一个值
      return；return表达式；

      传值
      每个函数有自己的变量空间，参数也有自己的空间，跟函数没有关系
      调用函数时给的值叫做实际参数，函数参数表的的参数叫做形式参数
      调用函数误以为是将变量传进去，而其实只是将值传过去

      函数运行这次所独有的，定义在函数内部的变量叫做本地变量，参数也是本地变量
       */

    }
}