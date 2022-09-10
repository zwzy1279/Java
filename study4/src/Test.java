public class Test {
        public void bookName(String...books){
            //System.out.println(books);
            for(int i=0;i<books.length;i++){
                System.out.println(books[i]);
            }
        }

        /*
        2.编写程序，定义三个重载方法并调用。方法名为mOL。
>三个方法分别接收一个int参数、两个int参数、一个字符串参数。
分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
>在主类的main()方法中分别用参数区别调用三个方法。I
         */
    public int mOL(int num){
        return num*num;
    }
    public int mOL(int num1,int num2){
        return num1*num2;
    }
    public String mOL(String ch){
        return ch;
    }

}
