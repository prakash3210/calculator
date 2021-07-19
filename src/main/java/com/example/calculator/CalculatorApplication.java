package com.example.calculator;

import java.util.Collection;

import com.example.calculator.service.Operations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(CalculatorApplication.class, args);
		
		var calculator = ctx.getBean(Calculator.class);
		calculator.calculate(120, 30, '+');
		calculator.calculate(120, 30, '-');
	}
	
	@Bean
	public Calculator calculator(Collection<Operations> operations) {
		return new Calculator(operations);
	}

}
