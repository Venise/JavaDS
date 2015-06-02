package com.heap.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HeapSortApp {
	public static void main(String[] args) throws IOException{
		int size,j;
		System.out.print("Enter number of items:");
		size = getInt();
		Heap theHeap = new Heap(size);
		for(j=0; j<size; j++){
			int random = (int) (java.lang.Math.random()*100);
			Node newNode = new Node(random);
			theHeap.insertAt(j, newNode);//��������ɵ����ִ����ɽڵ����˳��ŵ�����
			theHeap.incrementSize();//��������
		}
		//��������������������ʾ������һ��
		System.out.println("Random:");
		theHeap.displayArray();
		theHeap.displayHeap();
		
		//�����һ��Ԫ�صĸ��ڵ㿪ʼ���µ�����һֱ����
		//��������Ҫ��ɱ�׼�Ķ�
		for(j=size/2-1; j>=0; j--)
			theHeap.trickleDown(j);
		//������ʾ������һ��
		System.out.println("Heap:");
		theHeap.displayArray();
		theHeap.displayHeap();
		
		//ͨ��ѭ��ɾ�������ٰ�ɾ�������ݷ���������ָ����λ��
		//�õ�һ����С�������������
		for(j=size-1; j>=0; j--){
			Node biggstNode = theHeap.remove();
			theHeap.insertAt(j, biggstNode);
		}
		//����������ʾ������һ��
		System.out.println("Sorted Heap:");
		theHeap.displayArray();
	}

	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
		
	public static int getInt() throws IOException{
		return Integer.parseInt(getString());
	}
}
