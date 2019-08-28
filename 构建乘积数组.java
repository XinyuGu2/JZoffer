/**
 * 建立对角线为1的二维数组，上三角和下三角分别连乘
 * 替代了嵌套的for循环，让时间复杂度O(n2)降到了O(n)
 */


import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        if (length!=0){
            B[0] = 1;
            for(int i=1; i<length; i++){
                B[i] = B[i-1] * A[i-1];
            }
            int temp = 1;
            for(int j=length-2; j>=0; j--){
                temp *= A[j+1];
                B[j]*=temp;
            }
        }
        return B;
    }
}