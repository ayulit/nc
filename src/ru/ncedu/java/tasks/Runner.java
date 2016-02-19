package ru.ncedu.java.tasks;

import java.util.Random;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!"); 
		
		ControlFlowStatements1 object = new ControlFlowStatements1Impl();
		
		System.out.println(object.getFunctionValue((float) (3.14/2))); // 2
		System.out.println(object.getFunctionValue(0)); // 6
		System.out.println(object.getFunctionValue(-2)); // 8
		
		System.out.println(object.decodeWeekday(4)); // Thursday
		
        // Prints 2D array
		for(int[] row : object.initArray()) {
            printRow(row);
        }
		
		System.out.println("=========================");
		
		// Random integer between 1(inclusive) and 100 (exclusive)
		Random random = new Random();
        int Low = -11;
        int High = 100;
        int max_i=1;
        int max_j=1;
        
        int twoDm[][]= new int[max_i][max_j];
        
        for(int i=0;i<twoDm.length;i++) {
            for(int j=0;j<twoDm[0].length;j++) {
                twoDm[i][j]=random.nextInt(High-Low) + Low;        
            }
        }
        for(int[] row : twoDm) {
            printRow(row);
        }
        System.out.println("Min Prev = " + object.getMinValue(object.initArray()));
        System.out.println("Min Random = " + object.getMinValue(twoDm));
        System.out.println("BankDeposit = " + object.calculateBankDeposit(10).toString());
		

	}
	
    // printing 2D array
	public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }

}
