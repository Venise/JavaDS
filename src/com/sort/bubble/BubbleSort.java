package com.sort.bubble;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {49,38,65,97,76,13,27,49};
		array = bubble(array);
//		for(int i=0; i<array.length; i++)
//			System.out.print(array[i]+ " ");
//		System.out.println();
	}
	
	/*
	 * ð������ÿִ��һ�ˣ��ҵ����ֵ������ĩβ
	 * ��������Ԫ�ؽ��� �Ƚϡ�����
	 * ��ʼ��inner=0,outer=array.length-1
	 */
	private static int[] bubble(int[] array){
		int inner, outer;//����ָ�룬�ڲ�����
		for(outer = array.length-1; outer>0; outer--){
			for(inner=0; inner < outer; inner++) {
				if(array[inner] > array[inner+1]){
					int temp = array[inner];
					array[inner] = array[inner+1];
					array[inner+1] = temp;
				}
			}
			
			if(outer == array.length-1){
				System.out.println("��������" + array[array.length-1]+ " ");
			}
			if(outer == array.length-2){
				System.out.println("�����ڶ��������" + array[array.length-2]+ " ");
			}
			if(outer == array.length-3){
				System.out.println("���������������" + array[array.length-3]+ " ");
			}
			for(int i=0; i<array.length; i++)
				System.out.print(array[i]+ " ");
			System.out.println();
		}
		return array;
	}
}
