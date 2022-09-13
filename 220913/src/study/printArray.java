package study;

/**
 * @Description: TODO
 * @Author: lmwis
 * @Data: 2022/9/13 7:05 下午
 * @Version: 1.0
 */
public class printArray {
 public static void main(String args[]){
   //定义一个数组，要求输出数组中每个数除以首位值
   int[] arr=new int[]{12,34,48,72};
   /*错误写法for(int i=0;i<arr.length;i++){
      arr[i]=arr[i]/arr[0];
   }*/
   for(int i=arr.length-1;i>=0;i--){
     arr[i]=arr[i]/arr[0];
   }//或者将arr[0]单独拿出来付给一个值
   for(int i=0;i<arr.length;i++){
     System.out.println(arr[i]);
   }

   int[] arr2=new int[]{12,34,48,72};
   System.out.println(arr2);//[I@610455d6一个地址值
   char[] arr3=new char[]{'r','t','r'};
   System.out.println(arr3);//rtr
 }
}
