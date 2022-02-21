
public class Calculator {
	private double results;
	private double num1; 
	private double num2;
	private double num3;
	private boolean completed; 
	
	//10.5+(5.2*10)= 62.5
	
	private char operator; 
	
	public Calculator () {
		
	}
 
	public void setNum1(double num1) {
		this.num1 = num1;
	}


	public void setNum2(double num2) {
		this.num2 = num2;
	}


	public void setNum3(double num3) {
		this.num3 = num3;
	}
	
	public void setOperator(char operator) {
		this.operator = operator;
	}
	
	public void performOperation() 
	
	{
		if (this.operator == '*') {
			results=num1*num2; 
		}
		if(this.operator == '-') {
			results=num1 -num2; 
		}
		if(this.operator == '+') {
			results+=num3; 
		}
		if(this.operator == '/') {
			results=num1 /num2; 
		}
		
		
	}
	
	public void getResults() {
		System.out.println(results);
	}
	
	
	
	

}
