package com.sort.select;

public class SelectSort {

	public static void main(String[] args) {
		int[] array = {1,9,3,6,33,88,2,5,7};
		array = select(array);
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+ " ");
		System.out.println();
	}
	
	/*
	 * ѡ������
	 * һ���������ҵ���Сֵ������Сֵ������λ
	 * outer(min)=0,inner=1=outer+1
	 */
	private static int[] select(int[] array){
		int outer, inner, min;
		for(outer=0; outer<array.length-1; outer++){
			min = outer;//��ʼ��minָ�������
			for(inner=outer+1; inner< array.length; inner++){
				if(array[inner] < array[min])
					min = inner;//ֻ������Сֵ����������һ�˱ȽϽ������ҵ���Сֵ���ٽ��н�����
			}
			int temp = array[outer];
			array[outer] = array[min];
			array[min] = temp;
		}
		return array;
	}
}
