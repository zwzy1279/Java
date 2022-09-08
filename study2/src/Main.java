import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //方法的使用中，可以调用属性或者方法
        //方法的使用中，自己调用自己的方法叫做递归，递归里的参数是有限制的，如果一直没有跳出循环，那么会出现内存溢出
        //不能在方法里去定义方法，只能调用
        student p=new student();

        //System.out.println(p.name+"今年"+p.age+"岁，读"+p.major+"专业，有"+p.interests+"爱好");
        p.say();


        Person person=new Person();
        person.age=20;
        person.showAge();
        person.addAge(2);
        //体会同一个类中使用不同对象
        Person person2=new Person();
        System.out.println(person.age);
        System.out.println(person2.age);//0

        Scanner in=new Scanner(System.in);
        Circle circle=new Circle();
        circle.r=1;
        //System.out.println("请输入半径");
        //int i=in.nextInt();
        circle.cs();

        /*
        面向对象编程内容的三条主线：
        类以及类的成员：属性，方法，构造器，代码块，内部类
        面向对象的三大特征：继承 封装 多态
        其他关键字：this super abstract interface static final package import

        面向对象的编程思想
        类，对象：面向对象的三大特征
        谈谈你对类和对象关系的理解
          类是抽象的
          对象是实实在在存在的个体
          对象是类派生出来的

        类和对象的创建和执行步骤有哪些
          创建类
          new对象，对象的实例化
          调用对象的结构，通过对象.属性/方法去调用
        画出以下代码内存分配情况

        类的方法是否可以定义变量，调用属性，定义方法，调用方法
                          是    是       否     是

         面向对象和面向过程
         面向过程：强调的是功能行为，一函数为最小单位，考虑怎么做
         面向对象：强调的是具备功能的对象，，以类或者对象为最小单位，强调做的是谁

         完成一个项目的思路
         根据问题需要，选择问题所针对的现实世界的实体
         从事体重寻找相关解决问题的属性和方法，这些功能和类成就了概念世界中的类
         把抽象的实体用计算机语言描述，形成计算机世界中类的定义。即借助某种程序，把类构造成计算机能够识别处理的数据结构
         将类实例化成计算机中的对象，对象是计算机世界中解决问题的最终工具

         面向对象中两个重要的概念
         类：对一类事物的描述，是抽象的，概念的定义
         对象：是世纪存在的该类事物的每个个体，因而也被称实例
         面向对象程序设计的重点就是类的设计
         设计类，就是设计类的成员


         jvm规范
         局部变量存在栈结构中
         new出来的对象，数组在堆空间中；对象的属性（不含static)加载在堆空间中
         方法区：类的加载信息，常量池，静态域
         */
        practice1 p1=new practice1();
        //p1.method();
        practice2 p2=new practice2();
        int s=p2.method2(2,3);//返回值得用一个变量来接收他的值
        System.out.println(s);

        //创建20个学生对象
//        practice3 p3=new practice3();
//        practice3 p4=new practice3();
//        practice3 p4=new practice3();
        //这样创建对象太麻烦，而且还得想不一样的变量名
        //创建一个Practice3的数组
        practice3[] p3=new practice3[20];

        //将每个数组元素的对象new出来
        for(int i=0;i<20;i++){
          p3[i]=new practice3();
        }
        //学号为1到20
        //年级[1,6]和成绩[0,100]都由随机数确定
        for(int i=0;i<20;i++){
            p3[i].number=i+1;
            p3[i].state=(int)(Math.random()*(6-1+1)+1);
            p3[i].score=(int)(Math.random()*(100-0+1)+1);
        }
        //p3.number(3);
        for(int i=0;i<20;i++){
            if(p3[i].state==3){
                System.out.println(p3[i].number+","+p3[i].state+","+p3[i].score);
            }
        }
        System.out.println("排序");
        //排序
        for(int i=0;i< p3.length-1;i++){
            for(int j=0;j<p3.length-1-i;j++){
                int temp=p3[j].score;
                p3[j].score=p3[j+1].score;
                p3[j+1].score=temp;
            }
            System.out.println(p3[i].number+","+p3[i].state+","+p3[i].score);
        }

        //返回信息
    }

    /*
        编写程序，声明一个method方法，在方法中打印一个10*8的矩形，在main方法中调用该方法
         */
    /*
    修改上一个程序，在method方法提供m和n两个参数，方法中打印m*n的矩形，并计算该矩形的面积，将其作为方法返回值。
    在main方法中调用该方法，接收返回的面积值并打印
     */
    /*
    4.对象数组题目:
定义类Student，包含三个属性:学号number(int)，年级state(int)，成绩score(int)。创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一:打印出3年级(state值为3)的学生信息。
问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息
提示:
1)生成随机数:Math.random()，返回值类型double:
2)四舍五入取整:Math.round(double d)，返回值类型long。


5.声明一个日期类型MyDate:有属性:年year，月month，日day创建2个日期对象，分别赋值为:你的出生日期，你对象的出生日期，并显示信息。
     */

}


