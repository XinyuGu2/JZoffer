# -*- coding:utf-8 -*-

#【分析】 每个台阶可以看作一块木板，让青蛙跳上去，n个台阶就有n块木板，
#最后一块木板是青蛙到达的位子， 必须存在，其他 (n-1) 块木板可以任意选择是否存在，
#则每个木板有存在和不存在两种选择，(n-1) 块木板 就有 [2^(n-1)] 种跳法，可以直接得到结果。
class Solution:
    def jumpFloorII(self, number):
        # write code here
        if number <= 0:
            return 0
        else:
            return pow(2, number-1)
       