package fr.diginamic.testexceptions;

public class TestException {

	public static void main(String[] args) {

		double op1 = 0;
		double op2= 0;
		
		
		try {
			op1 = Operation.diviser(6, 3);
			op2= Operation.diviser(6, 0);
		} catch (DenominateurNul e) {
			System.out.println(e.getMessage());
		}
		System.out.println(op1);
		System.out.println(op2);
		
	}
}
