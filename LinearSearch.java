
public class LinearSearch extends TestTimes implements SearchInterface {

	public int search(int[] listOfNumbers, int target) {	
		int n = listOfNumbers.length;
		
		for (int i = 0; i < n; i++) {
			if (listOfNumbers[i] == target) {
				return i;
			}	
		}
		return -1;
	}

	@Override
	public int search(int[] listOfNumbers, int target, int sI, int eI) {
		// TODO Auto-generated method stub
		return 0;
	}


}
