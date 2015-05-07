package com.search.binary;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = {1,4,6,8,10,13,16};
		int result = binarySearch(array, 0 , array.length-1, 20);
		int result2 = binarySearchRec(array, 0 , array.length-1, 16);
		if(result == array.length)
			System.out.println("û�ҵ�");
		else
			System.out.println("�ҵ���: " + result);
		if(result2 == array.length)
			System.out.println("û�ҵ�");
		else
			System.out.println("�ҵ���: " + result2);
	}
	
	//���ֲ���
	private static int binarySearch(int[] array, int lower, int upper, int searchKey){
		int lowerBound, upperBound, currentIn;
		lowerBound = lower;
		upperBound = upper;
		while(true) {
			currentIn = (lowerBound + upperBound)/2;
			if(array[currentIn] == searchKey)
				return currentIn;
			else if(lowerBound > upperBound)//û���ҵ�
				return array.length;//���ش����������
			else{
				if(array[currentIn] < searchKey)
					lowerBound = currentIn+1;
				else
					upperBound = currentIn-1;
			}
		}
	}
	
	//�ݹ���ֲ���
	private static int binarySearchRec(int[] array, int lower, int upper, int searchKey){
		int currentIn;
		currentIn = (lower + upper)/2;
		if(array[currentIn] == searchKey)
			return currentIn;
		else if(lower > upper)
			return array.length;//���ش����������
		else{
			if(array[currentIn] < searchKey)
				return binarySearchRec(array, currentIn+1, upper, searchKey);
			else
				return binarySearchRec(array, lower, currentIn-1, searchKey);
		}
	}
}
