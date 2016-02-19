package ru.ncedu.java.tasks;

public class ControlFlowStatements1Impl implements ControlFlowStatements1 {

	public ControlFlowStatements1Impl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getFunctionValue(float x) {
		// TODO Auto-generated method stub		
		if (x>0) 
		{
			return (float) (2*Math.sin(x));
		} else 	{
			return 6-x;
		}				
	}

	@Override
	public String decodeWeekday(int weekday) {
		// TODO Auto-generated method stub
	    String weekdayString;	    
        switch (weekday) {
            case 1:  weekdayString = "Monday";
                     break;
            case 2:  weekdayString = "Tuesday";
                     break;
            case 3:  weekdayString = "Wednesday";
                     break;
            case 4:  weekdayString = "Thursday";
                     break;
            case 5:  weekdayString = "Friday";
                     break;
            case 6:  weekdayString = "Saturday";
                     break;
            case 7:  weekdayString = "Sunday";
                     break;            
            default: weekdayString = "Invalid weekday";
                     break;
        }		
		return weekdayString;
	}

	@Override
	public int[][] initArray() {
		// TODO Auto-generated method stub
		int[][] array = new int[8][5];
		
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[j].length; j++)
			{
				array[i][j] = i*j;
			}	
		}
		
		return array;
	}

	@Override
	public int getMinValue(int[][] array) {
		// TODO Auto-generated method stub
		
		int min = array[0][0];
		
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[0].length; j++)
			{
				if(array[i][j] < min)
				{
                    min = array[i][j];
				}
			}	
		}
		
		return min;
	}

	@Override
	public BankDeposit calculateBankDeposit(double P) {
		// TODO Auto-generated method stub
		int treshold = 5000;
		double gain = 1.0 + P / 100 ;
		
		BankDeposit bankDeposit = new BankDeposit();
		
		bankDeposit.amount = 1000;
		
		while (bankDeposit.amount <= treshold)
		{
			bankDeposit.amount *= gain;
			bankDeposit.years++;
		}
		
		return bankDeposit;
	}

}
