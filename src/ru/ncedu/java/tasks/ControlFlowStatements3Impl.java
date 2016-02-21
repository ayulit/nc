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
		return 0;
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
		return null;
	}

	/* (non-Javadoc)
	 * @see ru.ncedu.java.tasks.ControlFlowStatements3#getMaxProductIndex(long[][])
	 */
	@Override
	public int getMaxProductIndex(long[][] array) {
		// TODO Auto-generated method stub
		return 0;
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
