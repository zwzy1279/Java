import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*
        如何理解万事万物皆对象
        我们都将功能，结构封装在类中，通过类的实例化，来调用类的功能结构
           Scanner
           String
           文件：file
           网络资源：URL
        涉及java,包括html,sql，后端交互时，前后端在java层面交互时，都体现为类，对象

        引用类型的变量：只可能存储两类值，
        对象数组的内存解析

        匿名对象：就是在new对象没有进行赋值给变量来使用
        而我么好每次使用都需要new一次，所以每次一调用对象都会在堆空间在生成一个
        我们知道Person p=new Person();
          在堆空间开辟一块空间存储new Person,将地址值赋值给p,后面p进行调用的都指向同一个对象



         */
        new Student().score=87;
        System.out.println(new Student().score);//0,不是87

        //创建一个来处理数组的类
        //创建一个数组
        int[] arr=new int[6];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        //  求数组中数的最大值，最小值，平均值，复制一份，排序
        DealArray deal=new DealArray();
        //deal.printArray(arr);
        int max=deal.discoverMax(arr);
        System.out.println("数组的最大值是"+max);
        int min=deal.discoverMin(arr);
        System.out.println("数组的最小值是"+min);
        int average=deal.discoverAverage(arr);
        System.out.println("数组的平均值是"+average);
        int value=deal.discoverValue(arr,33);
        if(value==-1){
            System.out.println("该值不存在");
        }
        else{
            System.out.println("该值是第"+value+"个");
        }
        deal.sortArray(arr);


    }
}