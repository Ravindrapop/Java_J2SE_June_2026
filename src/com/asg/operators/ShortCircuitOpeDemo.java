package com.asg.operators;

public class ShortCircuitOpeDemo {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		if(++x>5 & ++y<10) {
			++x;
		}
		else {
			++y;
		}
		System.out.println(x+"   "+y);

	}

}
