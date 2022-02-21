
public class Program {
	public static void main(String[] args) {
		Calculator newCal= new Calculator(); 
		newCal.setNum1(10);
		newCal.setNum2(5.2);
		newCal.setOperator('*');
		newCal.performOperation();
		newCal.setNum3(10.5);
		newCal.setOperator('+');
		newCal.performOperation();
		newCal.getResults(); 
	
}
}
