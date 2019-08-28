# -*- coding:utf-8 -*-
class Solution:
    def multiply(self, A):
        # write code here
        B = [1 for i in range(len(A))]
        for i in range(len(A)):
            for j in range(len(A)):
                if j!=i:
                    B[i] *= A[j]
        return B
                