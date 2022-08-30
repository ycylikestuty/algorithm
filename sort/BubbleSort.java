package sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,10,1,8,2,5,9};
        int len=arr.length;

        //冒泡排序
        for(int i=0;i<len-1;i++){
            boolean flag=false;

            for(int j=0;j<len-1-i;j++){
                if(arr[j]>arr[j+1]){
                    flag=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

            if(flag==false){//没有发生交换，表明已经排序好，直接退出第一层for循环
                break;
            }
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
