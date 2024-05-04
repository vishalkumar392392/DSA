package com.geeks.stack;

import java.util.HashMap;
import java.util.Stack;

public class S4BalancedParenthesis {

	public static void main(String[] args) {
		String input = "((())";
		System.out.println(balancedParenthesis(input));
	}

	static boolean isMatching(char a, char b) {

		return ((a == '(' && b == ')') || (a == '{' && b == '}') || a == '[' && b == ']');
	}

	static boolean isBalanced(String str) {

		Stack<Character> s = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if (x == '(' || x == '{' || x == '[') {
				s.add(x);
			} else {
				if (s.isEmpty())
					return true;
				else if (!isMatching(s.peek(), str.charAt(i)))
					return false;
				else {
					s.pop();
				}
			}
		}

		return s.isEmpty();
	}

	static boolean balancedParenthesis(String s) {

		HashMap<Character, Character> h = new HashMap<>();
		h.put('}', '{');
		h.put(')', '(');
		h.put(']', '[');

		Stack<Character> a = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (i == 0 && h.containsKey(s.charAt(i)))
				return false;
			if (!h.containsKey(s.charAt(i))) {
				a.add(s.charAt(i));
			} else {
				if (h.get(s.charAt(i)) == a.peek()) {
					a.pop();
				}

			}

		}

		return a.isEmpty();
	}

}
