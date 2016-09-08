package com.example.app;

import org.springframework.stereotype.Component;

@Component
public class SubstractCalculator implements Calculator {

	@Override
	public int calc(int a, int b) {
		return a - b;
	}

}
