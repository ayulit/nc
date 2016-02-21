package ru.ncedu.java.tasks;

import java.util.Random;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
		
		ControlFlowStatements3 object = new ControlFlowStatements3Impl();
		
		System.out.println(object.getFunctionValue(-1.5));
		System.out.println(object.decodeSeason(2));
		
        for(long[] row : object.initArray()) {
            printRow(row);
        }
        
        System.out.println("====================================");
        
		// Random integer between 1(inclusive) and 100 (exclusive)
		Random random = new Random();
        int Low = 1;
        int High = 100;
        int max_i=3;
        int max_j=3;
        
        long twoDm[][]= new long[max_i][max_j];
        
        for(int i=0;i<twoDm.length;i++) {
            for(int j=0;j<twoDm[0].length;j++) {
                twoDm[i][j]=random.nextInt(High-Low) + Low;        
            }
        }
        for(long[] row : twoDm) {
            printRow(row);
        }
        System.out.println("MPI Prev = " + object.getMaxProductIndex(object.initArray()));
        System.out.println("MPI Random = " + object.getMaxProductIndex(twoDm));
        
		

	}
	
    // printing 2D array
	public static void printRow(long[] row) {
        for (long i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }

}
