/**
 * 题目描述
一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */

public class Solution {
    public int JumpFloor(int target) {
        //解法一：递归
    //     if (target<=0){
    //         return 0;
    //     }
    //     else if (target==1){
    //         return 1;
    //     }
    //     else if (target==2){
    //         return 2;
    //     }
    //     else{
    //         return JumpFloor(target-1) + JumpFloor(target-2);
    //     }
    // }
        //解法二：迭代
    if (target==1|target==2){
        return target;
    }
    int jumpSum = 0;
    int jumpSumBackStep1 = 2; //当前台阶为3，后退一阶的即第2阶的跳法总数
    int jumpSumBackstep2 = 1;
    // 思路：当前台阶的跳法总数=当前台阶后退一阶的台阶的跳法总数+当前台阶后退二阶的台阶的跳法总数
    for (int i=3;i<=target;i++){
        jumpSum = jumpSumBackStep1 + jumpSumBackstep2;
        jumpSumBackstep2 = jumpSumBackStep1;
        jumpSumBackStep1 = jumpSum;
    }
    
    return jumpSum;
}
}