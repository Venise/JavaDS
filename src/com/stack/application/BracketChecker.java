package com.stack.application;
/**
 * ����{([��Щ���ŵı��ʽ�У������Ƿ��ǳɶԳ���
 */
public class BracketChecker {
	private String input;
	public BracketChecker(String in){
		input=in;
	}
	
	public void check(){
		int stackSize=input.length();
		StackX stack=new StackX(stackSize);
		//���ܳ��ֵ������1��{[(;	2��}]);	3��{])	4��{}])
		for(int j=0; j<stackSize;j++){
			char ch=input.charAt(j);
			//if(c=="{" || c=="["||c=="("} //��������ӦΪ'{'
			switch(ch){
			case '[':
			case '{':
			case '(':
				//ѹջ
				stack.push(ch);
				break;
			case ']':
			case '}':
			case ')':
				//��ջ
				if(!stack.isEmpty()){
					char chx=stack.pop();
					if((ch==']'&& chx!='[')||(ch=='}'&& chx!='{')||(ch==')'&& chx!='(')){
						System.out.println("Error: "+ch+"at: " +j);
					}
				}else{
					System.out.println("Error: "+ch+"at: " +j);
				}
				break;
			default:
				break;
			}
		}
		if(!stack.isEmpty()){
			//ִ�е��ˣ�����ж�Ӧ�ķ��ţ�Ӧ��ȫ������������Ϊ�գ�˵����߷���û����Ӧ���ұߵķ���
			System.out.println("Error: missing right bracket.");
		}
	}
}
