package com.sort.bubble;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {1,9,3,6,33,88,2,5,7};
		array = bubble(array);
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+ " ");
		System.out.println();
	}
	
	/*
	 * 冒泡排序：每执行一趟，找到最大值，放在末尾
	 * 相邻两个元素进行 比较、交换
	 * 初始：inner=0,outer=array.length-1
	 */
	private static int[] bubble(int[] array){
		int inner, outer;
		for(outer = array.length-1; outer>0; outer--){
			for(inner=0; inner < outer; inner++) {
				if(array[inner] > array[inner+1]){
					int temp = array[inner];
					array[inner] = array[inner+1];
					array[inner+1] = temp;
				}
			}
		}
		return array;
	}
}
