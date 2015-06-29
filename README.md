##Java数据结构与算法


* 数组
* 栈
* 队列：优先级队列
* 链表：单链表 双端链表 有序链表 双向链表 链表ADT
* 二叉树：完全二叉树 红黑树
* 堆
* 图
* 哈希表
* 递归

* * * * *
###查找：
二分查找

###排序：
1. 冒泡排序
* 选择排序
* 插入排序
* 希尔排序
* 归并排序
* 快速排序
* 堆排序

* * *
###红黑树：（平衡树）增加某些特点的二叉搜索树
1. 节点都有颜色；
* 在插入和删除过程中，要遵循保持这些颜色的不同排列的规则。

###红-黑规则：
1. 每个节点不是红色就是黑色的；
* 根总是黑色的；
* 如果节点是红色，则它的子节点必须是黑色的（反之不一定必须）
* 从根节点到叶节点或者空子节点的每条路径，必须包含相同数目的黑色节点。

* * *
###堆：一种数据存储结构（与编程语言的堆相区分），是一种特殊的二叉树，快速插入和删除
1. 概念上，完全的二叉树（非平衡树）；
* 常常用一个数组来实现；
* 堆中的每一个节点都满足堆的条件，父节点的关键字要大于所有子节点（相比较与于二叉搜索树，弱序；不支持遍历和搜索）。
    用有序数组实现优先级队列，删除最大数最快为O(1)，插入慢
	用堆实现优先级队列，插入和删除都很快（o(logN)）

###图
* DFS：深度优先搜索
* BFS：广度优先搜索
