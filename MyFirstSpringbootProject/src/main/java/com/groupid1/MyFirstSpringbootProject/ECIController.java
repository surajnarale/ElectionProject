package com.groupid1.MyFirstSpringbootProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ECIController {

	@GetMapping("/addtwo")
	public String AdditionAPI() {

		int a = 10;
		int b = 20;
		int c = a + b;
		return "Addition is " + c;
	}

	@GetMapping("/subtract")
	public String SubtractionAPI() {
		int a = 10;
		int b = 20;
		int result = a - b;
		return "Subtraction is " + result;
	}

	@GetMapping("/divide")
	public String DivisionAPI() {
		int a = 10;
		int b = 20;
		if (b == 0) {
			return "Division by zero is not allowed";
		}
		double result = (double) a / b;
		return "Division result is " + result;
	}

	@GetMapping("/checkeven")
	public String CheckEvenOddAPI() {
		int number = 10;
		return number % 2 == 0 ? number + " is Even" : number + " is Odd";
	}

	@GetMapping("/factorial")
	public String FactorialAPI() {
		int number = 100;
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		return "Factorial of " + number + " is " + factorial;
	}

	@GetMapping("/reverse")
	public String ReverseStringAPI() {
		String input = " Suraj";
		String reversed = new StringBuilder(input).reverse().toString();
		return "Reversed string is " + reversed;
	}

	@GetMapping("/largest")
	public String LargestNumberAPI() {
		int a = 10;
		int b = 20;
		int c = 30;
		int largest = Math.max(a, Math.max(b, c));
		return "The largest number is " + largest;
	}

	@GetMapping("/concatenate")
	public String ConcatenateAPI() {
		String str1 = "suraj ";
		String str2 = "kiran "; 
		return "Concatenated string: " + str1 + " " + str2;
	}

	@GetMapping("/simpleinterest")
	public String SimpleInterestAPI() {
		double principal = 100;
		double rate = 2 ;
		double time = 2;
		double interest = (principal * rate * time) / 100;
		return "Simple Interest is " + interest;
	}

	@GetMapping("/square")
	public String SquareAPI( ) {
		int number = 100;
	    int square = number * number;
	    return "The square of " + number + " is " + square;
	}

}
