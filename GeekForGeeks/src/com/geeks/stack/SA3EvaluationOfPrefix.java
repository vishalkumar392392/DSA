package com.geeks.stack;

import java.util.Stack;

public class SA3EvaluationOfPrefix {
	
	
	public static void main(String[] args) {
		
		String exp = "* + 10 2 3";
		int res = efficient(exp);
		System.out.println(res);
	}

	private static int efficient(String exp) {
		
		String split[] = exp.split(" ");
		Stack<Integer> s = new Stack<>();
		
		for(int i = split.length - 1; i >=0; i--) {
			
			try {
				int num = Integer.valueOf(split[i]);
				s.push(num);
			} catch (Exception e) {
				
				switch (split[i]) {

				case "*":
					int num1 = s.pop();
					int num2 = s.pop();
					s.push(num1 * num2);
					continue;
				case "+":
					s.push(s.pop() + s.pop());
					continue;
				case "-":
					s.push(s.pop() - s.pop());
					continue;
				case "^":
					int sec = s.pop();
					int fir = s.pop();
					s.push((int)Math.pow(fir,sec));
					continue;
				default:
					continue;
				}
			}
		}

		return s.peek();
	}
	
	

}
