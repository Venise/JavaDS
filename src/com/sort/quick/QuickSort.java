package com.sort.quick;

public class QuickSort {

	private static int[] array = {1, 18, 2, 35, 97, 36, 148, 101, 147, 189, 122, 143, 20, 146, 24, 37};
//	private static int[] array = {1,2,3,2,2,2,5,4,2};
	public static void main(String[] args) {
		quickRec(0, array.length-1);
		for(int i = 0; i<array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	//�õݹ�ͻ��ּ������п�������
	public static void quickRec(int left, int right){
		if(left >= right) return;
		else {
			int pivot = array[right];
			int partition = partitionIt(left, right, pivot);
			if(partition > left)
				quickRec(left, partition-1);//�ݹ�ǰһ���֣�����
			if(partition < right)
			 quickRec(partition+1, right);//�ݹ��һ���֣�����
		}
	}
	
	public static int partitionIt(int left, int right, int pivot){
		int leftPtr = left-1;
		int rightPtr = right;
		while(true){
			while(array[++leftPtr] < pivot);//�˴�����ҪleftPtr<right������;���Ϊ���������У�leftPtr���ͣ��rightλ��
			while(rightPtr > 0 && array[--rightPtr] > pivot);
			if(leftPtr >= rightPtr) 
				break;
			else 
				swap(leftPtr, rightPtr);
		}
		swap(leftPtr, right);//��ʱleftPtr, right�����ں�벿�֣�����Ĳ���Ϊright��������rightPtr
		return leftPtr;
	}
	
	private static void swap(int leftPtr, int rightPtr) {
		int temp = array[leftPtr];
		array[leftPtr] = array[rightPtr];
		array[rightPtr] = temp;
	}
}
