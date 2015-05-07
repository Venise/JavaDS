package com.sort.insert;

public class InsertSort {

	public static void main(String[] args) {
		int[] array = {1,9,3,6,33,88,2,5,7};
		array = insert(array);
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+ " ");
		System.out.println();
	}

	/*
	 * ��������
	 * ��ǰ���Ԫ�ؿ�������������
	 * ��ǰԪ����ǰ��Ԫ�رȽϣ���ǰ��Ԫ��С������н���
	 * temp��ŵ�ǰλ�õ�Ԫ��ֵ
	 * ָ��һֱ�ƶ���ֱ����ǰԪ�ر�ǰһ�����ݴ󣬼��ҵ���ǰԪ�ص�����λ��
	 */
	private static int[] insert(int[] array) {
		int outer, inner;
		for(outer=0; outer<array.length; outer++){
			int temp = array[outer];//��¼��ǰԪ�ص�ֵ��������λ�ã���Ϊ��ǰλ���ϵ����ݿ��ܻᱻ������ֵ
			inner = outer;
			while(inner>0 && array[inner-1]>temp){//inner>0������temp < array[inner-1]ǰ��
				//��û�ҵ�λ�ã�ָ����ǰ��
				array[inner] = array[inner-1];//��һֱ����
				inner--;
			}
			array[inner] = temp;
		}
		return array;
	}
}
