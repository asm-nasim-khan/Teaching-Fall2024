# -*- coding: utf-8 -*-
"""Basic Linked List templateCode
"""

class Node:
    def __init__(self, data=None, next=None):
        self.element = data
        self.next = next

class MyList:
    #Creating Constractor
    def __init__(self,arr=None):
        if arr is None:
            self.head = None
        else:
            self.head = Node(arr[0],None)
            temp = self.head
            for i in range(1,len(arr)):
                temp.next = Node(arr[i],None)
                temp = temp.next

    def ShowList(self):
        n = self.head
        while(n != None):
            print(n.element,end=" ")
            n = n.next
a = [1,2,3,4]
linkList = MyList(a)
mylist2 = MyList()

linkList.ShowList()