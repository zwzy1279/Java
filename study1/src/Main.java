import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1类定义一般会分为属性（变量定义）和功能（方法/函数）
        属性 （定义变量）
        public int a;
        public String Name;
        功能  （方法/函数）
        public void isFood(){}         */



        //输出
        System.out.println("Hello world!");

//        输入Scanner 变量名
        Scanner a=new Scanner(System.in);
        System.out.println(a.nextLine());//读一整行进来
        //读一个整数进来
        int price=a.nextInt();//变量price
       // double inch;
        //inch=a.nextDouble();
        //常量
        final int account=100;
        System.out.println("100-"+price+"="+(100-price));

        //两个整数的运算结果是整数
        //当其中一个是浮点数时，运算的结果自动是浮点数

        //a=b数学中是两个数相等，而在编程中是将b赋值给a
        //没有赋值直接用是有点问题的，所以最好先初始化赋一个值

        //运算优先级：
//        1 单目运算符 + -自右向左
//        2 * / %
//        3 + - * /
//        4 =赋值  自右向左

        //强制转换成整数
        System.out.println((int)(12/3.0));

        //关系运算符：用来计算两个值之间的关系 ==  ！=   > <  >=  <=,满足则返回true
        //关系运算符优先级低于算术运算符，高于赋值
        //关系远算符中判断是否相等的运算符会比其他关系运算符低  ==  ！=
        //5>3==6>4  true==true  返回true
        //连续的关系运算符是自左向右进行计算的

        //浮点数可以和整数直接进行比较
        int n1=5;
        double n2=5.0;
        System.out.println(n1==n2);//true
        //浮点数不能直接和浮点数进行比较
        double n3=1.0;
        double n4=0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
        System.out.println(n3==n4);//false

        //if语句
        //双击数字可以出现断点，在进行debug判断
        if(n1>7){
            System.out.println("又进入到if程序执行语句");
        }

        //判断两个  if else
        //判断三个  级联 if   else if    else if    else
        System.out.println("----");

        int p;
        //多路分支
        switch(2){//switch后只能是整数型的结果
            case 1:p=1;break;//case后面为常量,y
            case 2:p=2;//执行到有break为止
            case 3:p=3;break;
            default:p=4;break;//所有case后没匹配，才进行default
    } System.out.println("p="+p);//3
        //键盘选中加上注释，到选中的一行后按住shift,按上下键控制范围
        //按住command键，在按住/，即可完成多行注释
        //而在按command+/,可以取消注释


        //算出一个数含几位数的算法
        //while循环问题 当条件成立时，执行下面语句
        //do while 先执行后在判断循环条件是否满足
        System.out.println("随意输入一个数：");
        //算出这个数含几位数
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int result;
        result=num;
        int account2;
        account2 =0;
        while(result!=0){//当result不等于0时，进行循环
            // 352/10=35 35/10=3 3/10=0
            result=result/10;
            account2=account2+1;
        }
        System.out.println("该数有"+account2+"位数");


        //计数循环算法
        System.out.println("火箭发射倒计时：");
        //默认为100秒
        int account3=100;
        while(account3>0){//到0秒开始退出循环，一共进行99-0+1=100次计数
            account3=account3-1;
            System.out.println(account3);
        }
        System.out.println("火箭开始发射");


        //猜数算法
        System.out.println("猜一个数比随机生成的数大还是小");
        //随机生成一个数[1,1d00]
        int num2=(int)(Math.random()*100+1);
        //从键盘输入一个数
        int fk=in.nextInt();
        while(num2!=fk) {//7次以内猜对
            if (num2 > fk) {
                System.out.println("比随机生成的数小了");
                fk=in.nextInt();
            } else if (num2 < fk) {
                System.out.println("比随机生成的数大了");
                 fk=in.nextInt();
            }
        }
        System.out.println("恭喜你猜对了");


     //求从键盘输入的数字的平均数算法,当输入-1时开始计数
        int num3=in.nextInt();
        //开始计数
        int account4=0;
        //把所有输入的数进行求和
        int sum=0;
        int result3;
        while(num3!=-1){
            account4=account4+1;
            sum=sum+num3;
            num3=in.nextInt();
        }
        result3=sum/account4;
        System.out.println("平均数为"+result3);

        //获取一个数的各个位数的,逆序输出原来的的数字算法
        System.out.println("请随机从键盘输入一个数：");
        int num4=in.nextInt();
        int digit;
        int result4=0;
        //352  个位数：352%10=2  十位数 ：352/10%10=5 百位数：352/100=3
        while(num4>0){//45
            //自右向左获取数字
            digit=num4%10;//5
            result4=result4*10+digit;//0+5=5  5*10+4=54
            System.out.println(digit);
            num4=num4/10;
        }
        System.out.println(result4);

        /*
        for可以写成while
        for循环像一个计数循环
        for(i=0;i<10;i++){}
        相当于
        int i=0;
        while(i<10){
        i++;}
         */

     //从1乘到n的算法
        int num5=in.nextInt();
        int j=1;
        for(int i=1;i<=num5;i++){
           j=j*i;
        }
        System.out.println(j);

        /*
        复合赋值也就是算术运算符和赋值结合在一起得到的
        +=  -=
        i++和++i有什么区别吗
        都是对i进行自增
        都是i=i+1

        a=i++;
        b=++i;
        i都在原有的基础上加上1
        a=原有的i
        b=原有的i加上1
         */



}}