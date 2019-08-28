 '''
解题思路：栈是单口的pop和push，队列是先进先出，将两个栈拼接在一起，栈B只能pop，一个栈A只能push
当栈B为空时，栈Apop给栈B做补充，栈A后进先出，正好满足队列的先进先出
'''

# -*- coding:utf-8 -*-
class Solution:
    def __init__(self):
        self.stackA = []
        self.stackB = []
        
    def push(self, node):
        # write code here
        self.stackA.append(node)
    def pop(self):
        # return xx
        if self.stackB:
            return self.stackB.pop()
        elif not self.stackA:
            return None
        else:
            while self.stackA:
                self.stackB.append(self.stackA.pop())
            return self.stackB.pop()
                