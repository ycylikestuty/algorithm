package sort;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr={2,10,1,8,3,5,9};
        int len=arr.length;
        for(int i=0;i<len;i++){
            int max=arr[i];
            for(int j=i+1;j<len;j++){
                if(max<arr[j]){
                    int temp=max;
                    max=arr[j];
                    arr[j]=temp;
                }
            }

            for(int x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
