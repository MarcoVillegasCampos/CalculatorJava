package com.codingdojo.main;



public class Calculator {

	public String operand;
	public double num1;
	public double num2;
	public double results;
	

	public double getResult() {
		return results;
	}

	public void setResult(double results) {
		this.results = results;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public Calculator() {


	}

	public String getOperand() {
		return operand;
	}

	public void setOperand(String operand) {
		this.operand = operand;
	}

	public double performOperation() {
		double result = 0;
		if (this.operand.equals("+")) {
			 result = getNum1() + getNum2();
			 this.results=result;
			 
			

		} else {
			if (this.operand.equals("-")) {
				result = getNum1() - getNum2();
				this.results=result;

			}
		
		}
		return results;
		
	}
	
	public void getResults() {
		System.out.println(this.results);
		
	}

}
