package edu.jsp.threads;

public class Printer {
	void print(String msg) {
		for (int i = 0; i < 20; i++) {
			System.out.println(msg);
		}
	}
}
