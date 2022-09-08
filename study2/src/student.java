public class student {
    //声明一个学生的类，并返回学生的个人信息，并且输出个人信息
        public String name="小红";
        public int age=19;
        public String major="soft";
        public String interests="computed";
        public String say(){
            //方法中输出个人信息
            System.out.println(name+"今年"+age+"岁，读"+major+"专业，有"+interests+"爱好");
            return name+age+major+interests;
        }



}
