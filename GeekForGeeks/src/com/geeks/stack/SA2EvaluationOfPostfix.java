package com.geeks.stack;

import java.util.Stack;

public class SA2EvaluationOfPostfix {

	public static void main(String[] args) {

		String exp = "10 2 + 3 *";
		int res = efficient(exp);
		System.out.println(res);

	}

	private static int efficient(String exp) {

		String[] split = exp.split(" ");
		Stack<Integer> s = new Stack<>();
		int res = 0;

		for (int i = 0; i < split.length; i++) {

			try {
				int num = Integer.valueOf(split[i]);
				s.push(num);
			} catch (Exception e) {

				switch (split[i]) {

				case "*":
					int num1 = s.pop();
					int num2 = s.pop();
					res =  num1 * num2;
					s.push(res);
					continue;
				case "+":
					res =  s.pop() + s.pop();
					s.push(res);
					continue;
				case "-":
					res =  s.pop() - s.pop();
					s.push(res);
					continue;
				case "^":
					int sec = s.pop();
					int fir = s.pop();
					 res = (int)Math.pow(fir,sec);
					s.push(res);
					continue;
				default:
					continue;
				}

			}
		}

		return s.peek();
	}

}
