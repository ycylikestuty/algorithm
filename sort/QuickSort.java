package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums={2,10,1,8,2,5,9};
        quicksort(nums,0,nums.length-1);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
    public static void quicksort(int[] nums,int left,int right){
        if(left<right){
            int pivotindex=partition(nums,left,right);
            //nums[pivotindex]已经处理好，所以不用再处理
            quicksort(nums,0,pivotindex-1);
            quicksort(nums,pivotindex+1,right);
        }
        else return;
    }

    //返回基准的下标
    public static int partition(int[] nums,int left,int right){
        int pivot=nums[left];
        int low=left;
        int high=right;
        while(low<high){
            while (low<high&&nums[high]>pivot){//找出比基准小的数的下标
                high--;
            }
            while ((low<high&&nums[low]<=pivot)){//找出比基准大的数的下标
                low++;
            }
            if(low<high){
                int temp=nums[low];
                nums[low]=nums[high];
                nums[high]=temp;
            }
        }

        //while循环结束说明low和high已经相遇
        //相遇的下标上的元素是多余的，将基准填入该位置，并返回下标，为分区做准备
        //即交换 nums[low] 和 nums[left]

        //可以直接使用pivot作为交换中间变量
//        int newtemp=nums[low];
//        nums[low]=pivot;
//        nums[left]=newtemp;

        pivot=nums[low];
        nums[low]=nums[left];
        nums[left]=pivot;
        return low;
    }

}
