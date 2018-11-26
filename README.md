# JavaSort
用Java实现几种排序算法


1.冒泡法：
原理：比较两个相邻的元素，将值大的元素交换至右端。
思路：依次比较相邻的两个数，将小数放在前面，大数放在后面。即在第一趟：首先比较第1个和第2个数，将小数放前，大数放后。
然后比较第2个数和第3个数，将小数放前，大数放后，如此继续，直至比较最后两个数，将小数放前，大数放后。
重复第一趟步骤，直至全部排序完成。

![image](https://github.com/zhanglu1994/JavaSort/blob/master/app/photo/%E5%86%92%E6%B3%A1.gif)

话不多说 代码实现如图：

![image](https://github.com/zhanglu1994/JavaSort/blob/master/app/photo/%E5%86%92%E6%B3%A1%E4%BB%A3%E7%A0%81%E5%AE%9E%E7%8E%B0.png)

验证如下图所示

![image](https://github.com/zhanglu1994/JavaSort/blob/master/app/photo/%E5%86%92%E6%B3%A1A.png)

![image](https://github.com/zhanglu1994/JavaSort/blob/master/app/photo/%E5%86%92%E6%B3%A1B.png)

2.插入法：

原理：是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
实现：1.将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
2.从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。

算法演示动图如下

![image](https://github.com/zhanglu1994/JavaSort/blob/master/app/photo/%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F.gif)

算法代码如下：

![image](https://github.com/zhanglu1994/JavaSort/blob/master/app/photo/%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F%E4%BB%A3%E7%A0%81%E5%AE%9E%E7%8E%B0.png)

3.选择排序法：
原理：选择排序是一种简单直观的排序算法，无论什么数据进去都是 O(n²) 的时间复杂度。所以用到它的时候，数据规模越小越好。
实现思路：1.首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置 2.再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。3.重复第二步，直到所有元素均排序完毕。

算法动态演示图如下
![image](https://github.com/zhanglu1994/JavaSort/blob/master/app/photo/%E9%80%89%E6%8B%A9%E6%8E%92%E5%BA%8F.gif)

代码实现如下图
![image](https://github.com/zhanglu1994/JavaSort/blob/master/app/photo/%E9%80%89%E6%8B%A9%E6%8E%92%E5%BA%8F%E4%BB%A3%E7%A0%81%E5%AE%9E%E7%8E%B0.png)



