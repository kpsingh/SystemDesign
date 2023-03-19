package com.java.design.questions;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * https://leetcode.com/problems/design-browser-history/
 */

public class BrowserHistory {
		
	Deque<String> stack_1;
	Deque<String> stack_2;
	String current;

	public BrowserHistory(String homepage) {
		stack_1 = new ArrayDeque<>();
		stack_2 = new ArrayDeque<>();
		current = homepage;
	}

	public void visit(String url) {

		stack_1.push(current);
		current = url;
		stack_2.clear();
	}

	public String back(int steps) {
		while (steps > 0 && !stack_1.isEmpty()) {
			stack_2.push(current);
			current = stack_1.pop();
			steps--;
		}
		return current;
	}

	public String forward(int steps) {
		while (steps > 0 && !stack_2.isEmpty()) {
			stack_1.push(current);
			current = stack_2.pop();
			steps--;
		}

		return current;
	}
	
	

	public static void main(String[] args) {

		String res = null;

		BrowserHistory bs = new BrowserHistory("esgriv.com");
		System.out.println(res);
		bs.visit("cgrt.com");
		System.out.println(res);
		bs.visit("tip.com");
		System.out.println(res);

		res = bs.back(9);
		System.out.println(res);

		bs.visit("kttzxgh.com");
		System.out.println("null");

		res = bs.forward(7);
		System.out.println(res);

		bs.visit("crqje.com");
		System.out.println("null");

		bs.visit("iybch.com");
		System.out.println("null");

		res = bs.forward(5);
		System.out.println(res);

		bs.visit("uun.com");
		System.out.println("null");

		res = bs.back(10);
		System.out.println(res);

		bs.visit("hci.com");
		System.out.println("null");
		bs.visit("whula.com");
		System.out.println("null");

		res = bs.forward(10);
		System.out.println(res);

	}

	
}
