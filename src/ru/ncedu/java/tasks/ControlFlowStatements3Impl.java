/**
 * 
 */
package ru.ncedu.java.tasks;

/**
 * @author andrey
 *
 */
public class ControlFlowStatements3Impl implements ControlFlowStatements3 {

	/**
	 * 
	 */
	public ControlFlowStatements3Impl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see ru.ncedu.java.tasks.ControlFlowStatements3#getFunctionValue(double)
	 */
	@Override
	public double getFunctionValue(double x) {
		// TODO Auto-generated method stub
		if (x<=0) 
		{
			return -x;
		}
		else if (x > 0 && x < 2)
		{
			return x*x;
		}
		else
		{
			return 4;
		}
		
	}

	/* (non-Javadoc)
	 * @see ru.ncedu.java.tasks.ControlFlowStatements3#decodeSeason(int)
	 */
	@Override
	public String decodeSeason(int monthNumber) {
		// TODO Auto-generated method stub
	    String monthString;
	    
	    if ((monthNumber >=1 && monthNumber <=2) || monthNumber == 12)
	    {
	    	monthString = "Winter";
	    }
	    else if (monthNumber >=3 && monthNumber <=5)
	    {
	    	monthString = "Spring";
	    }
	    else if (monthNumber >=6 && monthNumber <=8)
	    {
	    	monthString = "Summer";
	    }
	    else if (monthNumber >=9 && monthNumber <=11)
	    {
	    	monthString = "Autumn";
	    }	    
	    else
	    {
	    	monthString = "Error";
	    }
    
		return monthString;
	}

	/* (non-Javadoc)
	 * @see ru.ncedu.java.tasks.ControlFlowStatements3#initArray()
	 */
	@Override
	public long[][] initArray() {
		// TODO Auto-generated method stub
		long[][] array = new long[8][5];
		
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[j].length; j++)
			{
				array[i][j] = (long) Math.pow(Math.abs(i-j), 5);
			}	
		}
		
		return array;		
	}

	/* (non-Javadoc)
	 * @see ru.ncedu.java.tasks.ControlFlowStatements3#getMaxProductIndex(long[][])
	 */
	@Override
	public int getMaxProductIndex(long[][] array) {
		// TODO Auto-generated method stub
		int index = 0;		
		long maxProduct = getProduct(array[index]);		
		long product = -1 ;
		
		for (int i = 1; i < array.length; i++)
		{
			product = getProduct(array[i]);			
			if (product > maxProduct)
			{
				maxProduct = product;
				index = i;
			}
		}	
		
		return index;
	}

	private long getProduct(long[] row) {
		// TODO Auto-generated method stub
		long product = 1 ;
		for (int i = 0; i < row.length; i++)
		{
			product *= Math.abs(row[i]);
		}		
		return product;
	}

	/* (non-Javadoc)
	 * @see ru.ncedu.java.tasks.ControlFlowStatements3#calculateLineSegment(float, float)
	 */
	@Override
	public float calculateLineSegment(float A, float B) {
		// TODO Auto-generated method stub
		return 0;
	}

}
