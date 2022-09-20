package _package;
import java.util.ArrayList;
import java.util.Scanner;//快捷键为alt+enter
import practice.Boy;


import java.util.*;
public class _Import {
    //import关键字
    /*
    import：在源文件中显示的使用import结构导入指定包下的类，接口。
    声明在包和类的声明之间。
    如果需要并列写多个结构，则并列写即可
    可以使用import java.util.*;代表包下的所有结构
    java.lang包下的可以不用import结构
    包下声明的类在new过程中也不需要import结构
    想要调用其他包里的类，也要用import结构
    如果一个包里嵌套一个包，想要调用包里的包，也要用import结构
     */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);//得有import，不然会报错
        ArrayList a=new ArrayList();
        Boy b=new Boy();
    }
}
