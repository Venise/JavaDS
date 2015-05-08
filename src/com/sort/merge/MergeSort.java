package com.sort.merge;

public class MergeSort {

	private static int[] theArray = {11,33,77,99,22,0,44,66,88,55,25,78,55,97,106};
	
	public static void main(String[] args) {
		mergeSort(theArray, 0, theArray.length-1);
		for(int i=0; i<theArray.length; i++)
			System.out.print(theArray[i]+ " ");
		System.out.println();
	}
	
	public static void mergeSort(int[] array, int lowerBound, int upperBound){
		int[] workArray = new int[array.length];
		mergeSortRec(workArray, 0, array.length-1);
	}
	
	public static void mergeSortRec(int[] workArray, int lowerBound, int upperBound){
		if(lowerBound == upperBound) return;
		else{
			int mid = (lowerBound+upperBound)/2;
			mergeSortRec(workArray, lowerBound, mid);
			mergeSortRec(workArray, mid+1, upperBound);
			merge(workArray, lowerBound, mid+1, upperBound);
		}
	}

	private static void merge(int[] workArray, int lowerPtr, int highPtr, int upperBound) {
		int j=0;
		int lowerBound = lowerPtr;
		int mid = highPtr-1;
		int n = upperBound-lowerBound +1;//�п���ֻ�Ƕ������ĳһ���ֽ�����������n==theArray.length��һ������
		while(lowerPtr <= mid && highPtr <= upperBound){//���������������Ԫ�����ν��бȽ�
			if(theArray[lowerPtr] < theArray[highPtr])
				workArray[j++] = theArray[lowerPtr++];
			else
				workArray[j++] = theArray[highPtr++];
		}
		while(lowerPtr <= mid)//�ұ��������꣬��߻���ʣ���Ԫ��
			workArray[j++] = theArray[lowerPtr++];
		while(highPtr <= upperBound)//����������꣬�ұ߻���ʣ���Ԫ��
			workArray[j++] = theArray[highPtr++];
		for(j=0; j<n; j++)//����������������ƻ�ԭ����
			theArray[lowerBound+j] = workArray[j];
	}
}
