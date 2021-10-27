package com.codingdojo.main;




public class MainApp{
	
	
	
	public static void main (String[] args) {
	    Calculator calculator = new Calculator();
        calculator.setNum1(10.5);
        calculator.setNum2(5.2);
        calculator.setOperand("+");
        calculator.performOperation();
        calculator.getResults();
		
		
	}
}