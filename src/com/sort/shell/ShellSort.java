package com.sort.shell;

public class ShellSort {

	public static void main(String[] args) {
		int[] array = {11,33,77,99,22,0,44,66,88,55,25,78,55,97,106};
		array = shell(array);
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+ " ");
		System.out.println();
	}
	
	/*
	 * ����һ���ļ�������в�������
	 * �ݼ�����
	 */
	public static int[] shell(int[] array){
		int inner, outer;
		int h=1;
		while(h < array.length/3)
			h = h*3 + 1;
		while(h>0){
			for(outer=h; outer<array.length; outer++){
				int temp = array[outer];
				inner = outer;
				while(inner>h-1 && array[inner-h] > temp){//inner>h-1:��֤inner-h>-1,array[inner-h]��������
					array[inner] = array[inner-h];//Ĭ��ǰ��Ԫ�ص��������Ѿ�����
					inner-=h;
				}
				array[inner] = temp;
			}
			h = (h-1)/3;
		}
		return array;
	}
}
