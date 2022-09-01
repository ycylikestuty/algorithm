package xhs;
/*

题目描述：
小明是一名魔法师，他会n种法术，其中第i种法术的威力为ai，他经常通过双手各自释放一种法术来提升威力，
能得到的威力值为双手各自释放的法术的威力的乘积，但是他还不够强大，双手释放的两种法术必须是不同的，即不能双手释放同一种法术。
这天他接到了一个任务，需要释放威力值至少为K才能完成，他想请你帮他算一算，在两只手都释放法术的情况下，共有多少方案能达到威力值K。
每种方案可记作（u，v），u≠v，其威力值为au * av，（u，v）和（v，u）会被视为不同的方案。

输入描述
第一行两个正整数n和K，表示法术数量和威力值需求。

第二行为n个正整数a1, a2,......an，其中ai表示第i个法术的威力为ai。

输出描述
输出威力值至少为K的方案数

样例输入
3 3
3 2 1

样例输出
4

提示
1 <= n <= 30000, 1 <= K <= 10^16, 1 <= ai <= 10^9
 */

import java.util.Arrays;
import java.util.Scanner;

public class xhssecond {
    public static void main(String[] args) {
        int ans=0;
        Scanner  scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        Arrays.sort(nums);
        int ansindex=-1;
        //寻找nums[i]*nums[j]>=k的最左边下标
        for(int left=0;left<n;left++){
            if(nums[left]*nums[n-1]>=k){
                ansindex=left;
                break;
            }
        }
        if(ansindex==-1){
            System.out.println("没有找到");
        }else{
            //找到了最左边的下标
            //但是还存在相乘的结果<k的可能
            //比如2 3 5,k=7,2*3<k
            //此时可以将nums[ansindex]和nums[ansindex+1]相乘进行判断
            //因为数组已经排好序了
            int temp=n-ansindex;//注意不用再减1，因为要计算的是元素的个数，而不是元素之间的距离
            //比如n=3,ansindex=0,temp应该为3,而不是2
            if(nums[ansindex]*nums[ansindex+1]>=k){
                ans=(temp*(temp-1))/2;
            }
            else{
                ans=(temp*(temp-1))/2-1;
            }
        }
        System.out.println(2*ans);
    }
}
