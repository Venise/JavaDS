package com.queue.priority;

public class PriorityQ {
	private long[] queArray;
	private int maxSize;
	private int nItems;
	public PriorityQ(int s){
		maxSize = s;
		queArray = new long[maxSize];
		nItems = 0;
	}
	
	//��������������С����������С�������ȼ��ߣ�
	//(ront->)1��2��3��4��5��6(->
	//Front�˽���Ų����rearΪqueArray�±�Ϊ0��λ��
	public void insert(long item){
		int j;
		if(nItems == 0){
			queArray[nItems++] = item;
		}else{//���򣬼���֮ǰ���Ѿ��ź��򣬲�������
			for(j=nItems-1; j>=0; j--){
				if(item > queArray[j])
					queArray[j+1] = queArray[j];
				else 
					break;
			}
			queArray[j+1] = item;
			nItems++;
		}
	}
	
	public long remove(){//�Ƴ��±�����
		return queArray[--nItems];
	}
	
	public long peekMin(){
		return queArray[nItems-1];
	}
	
	public boolean isEmpty(){
		return nItems==0;
	}
	
	public boolean isFull(){
		return nItems == maxSize;
	}
}
