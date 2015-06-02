package com.heap.sort;

public class Heap {
	private Node[] heapArray;
	private int maxSize;
	private int currentSize;
	public Heap(int mx){
		maxSize=mx;
		currentSize=0;
		heapArray=new Node[maxSize];
	}
	
	public boolean isEmpty(){
		return currentSize==0;
	}
	
	public void insertAt(int index, Node newNode){
		heapArray[index] = newNode;
	}
	
	public void incrementSize(){
		currentSize++;
	}
		
	public Node remove(){//ɾ����
		Node root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];//�����һ�����������Ƶ����ڵ�
		trickleDown(0);//���µĸ�λ�õ���������бȽ����µ���
		return root;
	}

	public void trickleDown(int index) {//���µ���
		int largerChild;//����ӽڵ�λ��
		Node top = heapArray[index];//Ҫ���µ����Ľڵ����
		while(index < currentSize/2){//���δ�ҵ����һ��
			int leftChild = 2*index + 1;
			int rightChild = leftChild + 1;
			if(rightChild<currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey())
				largerChild = rightChild;
			else
				largerChild = leftChild;
			if(top.getKey() >= heapArray[largerChild].getKey())
				break;
			heapArray[index] = heapArray[largerChild];
			index = largerChild;
		}
		heapArray[index] = top;
	}
	
	public void displayArray(){
		//��������ʾ
		System.out.print("HeapArray:");
		for(int m=0; m<maxSize; m++){
			if(heapArray[m]!=null)
				System.out.print(heapArray[m].getKey() + " ");
			else System.out.print("-- ");
		}
		System.out.println();
	}
	
	public void displayHeap(){
		//����״��ʽ��ʾ
		System.out.println("HeapTree:");
		int nBlanks=32;//�ÿո�
		int itemPerRow=1;//ÿһ�����ݵĸ���
		int column=0;
		int j=0;
		String dots="...............................";
		System.out.println(dots+dots);
		while(currentSize>0){
			if(column==0){
				for(int k=0; k<nBlanks;k++)
					System.out.print(' ');
			}
			System.out.print(heapArray[j].getKey());
			if(++j==currentSize) break;//ȫ����ӡ���
			if(++column==itemPerRow){//����������ӡ��
				nBlanks/=2;
				itemPerRow*=2;
				column=0;
				System.out.println();
			}else{
				for(int k=0;k<nBlanks*2-2;k++)
					System.out.print(' ');
			}
		}
		System.out.println("\n"+dots+dots);
	}
}
