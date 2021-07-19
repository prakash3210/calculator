package com.example.calculator.service;

import org.springframework.stereotype.Component;

@Component
public class Subtraction implements Operations {

	@Override
	public int apply(int lhs, int rhs) {
		return lhs - rhs;
	}

	@Override
	public boolean handles(char op) {
		return '-' == op;
	}

}
