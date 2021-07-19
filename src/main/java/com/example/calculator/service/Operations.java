package com.example.calculator.service;

public interface Operations {
	
	int apply(int lhs, int rhs);
	boolean handles(char op);

}
