public class DealArray {
    //求数组中数的最大值，最小值，平均值，复制一份，排序
    public int discoverMax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public int discoverMin(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public int discoverAverage(int[] arr){
        int sum=0;
        int average;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        average=sum/arr.length;
        return average;
    }
    public int discoverValue(int[] arr,int Value){//查找指定值，并返回索引号
        for(int i=0;i<arr.length;i++){
            if(Value==arr[i]){
                return i+1;//返回第几个
            }
        }
       return -1;//找不到该值返回-1
    }
    public void sortArray(int[] arr){//给数组进行排序
        for(int i=0;i<arr.length-1;i++){//竖的进行这么多伦循环
            for(int j=0;j<arr.length-1-i;j++){//当竖的进行第一轮循环时，减掉i为0，横的还剩5次
                if(arr[j]>arr[j+1]){//从小到大进行排序
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //进行输出，调用函数
        printArray(arr);

    }
    public void printArray(int[] arr){//传进来一个数组
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
        }
    }
}
