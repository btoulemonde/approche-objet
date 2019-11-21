package fr.diginamic.testexceptions;

public abstract class TestRuntimeException {

	public static void main(String[] args) {
		double op1 = 0;
		double op2= 0;
		
		
		
			op1 = Operation.diviserRuntime(6, 3);
			op2= Operation.diviserRuntime(6, 0);
			
		
		System.out.println(op1);
		System.out.println(op2);

	}

}
