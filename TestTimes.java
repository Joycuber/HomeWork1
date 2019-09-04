public class TestTimes implements TestTimesInterface {
	long startTime = System.nanoTime();	
	long[] data = new long[10];
		
	long endTime = System.nanoTime();
	long testTime = endTime - startTime;
	
	int counter = 0;
	long sum = 0;
	
	
	@Override
	public long getLastTestTime() {
		
		if (endTime == 0) {
			return 0;
		}
		else { 
			return testTime;					
		}	
	}

	@Override
	public long[] getTestTimes() {

		long[] testTimeArr = new long[10];	
		int counter=0;
		for (int j = 0; j < counter; j++) {
			testTimeArr[j] = testTime;
		}
		return testTimeArr;
		
		
	}

	@Override
	public void resetTestTimes() {	
		startTime = 0;
		}

	@Override
	public void addTestTime(long testTime) {	
		sum = sum + testTime;
		
	}

	@Override
	public double getAverageTestTime() {
		
		if(counter==0) {
			System.out.println("You haven't started yet.");
		}
		return ( (double)sum/counter);
	}
}
