package com.geeks.stack;

public class SA1GetMaxInStack {
	
	public static void main(String[] args) {
		
		GetMaxInStack obj = new GetMaxInStack(10);
		
		obj.push(20);
		obj.push(30);
		System.out.print(obj.getMax() + " ");
		obj.push(25);
		System.out.print(obj.getMax() + " ");
		obj.pop();
		System.out.print(obj.getMax() + " ");
		obj.pop();
		System.out.print(obj.getMax() + " ");

	}

}


class GetMaxInStack{
	
	
	int mainStack[];
	int auxStack[];
	int top = -1;
	int auxTop = -1;
	
	public GetMaxInStack(int n) {
		
		mainStack = new int[n];
		auxStack = new int[n];
	}
	
	void push(int n) {
		
		if(top == -1) {
			top++;
			auxTop++;
			mainStack[top] = n;
			auxStack[auxTop] = n;
		}else {
			if(auxStack[auxTop] < n) {
				auxTop++;
				auxStack[auxTop] = n;
			}
			top++;
			mainStack[top]=n;
		}
	}
	
	int pop() {
		
		if(mainStack[top]==auxStack[auxTop]) {
			auxTop--;
		}
		
		int res = mainStack[top];
		top--;
		return res;
	}
	
	int getMax() {
		
		return auxStack[auxTop];
	}
}
