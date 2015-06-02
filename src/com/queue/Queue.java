package com.queue;
public class Queue {
	private long[] queArray;
	private int maxSize;
	private int front;
	private int rear;
	private int nItems;
	public Queue(int s){
		maxSize=s;
		queArray=new long[maxSize];
		front=0;
		rear=-1;
		nItems=0;
	}
	
	//����
	public void insert(long j){
		if(rear==maxSize-1)
			rear=-1;
		queArray[++rear]=j;
		nItems++;
	}
	
	//ɾ��
	public long remove(){
		//TODO ?Ϊʲô���Ƚ����пմ���
		long temp = queArray[front++];
		//ɾ��֮��
		if(front==maxSize-1)
			front=0;
		nItems--;
		return temp;
	}
	
	//�鿴
	public long peekFront(){
		return queArray[front];
	}
	
	public boolean isEmpty(){
		return nItems==0;
	}
	
	public boolean isFull(){
		return nItems==maxSize;
	}
	
	public int size(){
		return nItems;
	}
}
