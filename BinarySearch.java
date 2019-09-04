
public class BinarySearch extends TestTimes implements SearchInterface {

	@Override
	public int search(int[] listOfNumbers, int target, int sI, int eI) {

		if (sI > eI) {//base case value not in collection
			return -1;
		}
		int mid = (sI+ eI)/2;
		if(target == listOfNumbers[mid]) {//base case found at the location
		return mid; // return the location
		
	}
		else if (target>listOfNumbers[mid]) {// go right
			return search(listOfNumbers, target, mid+1, eI);
		}
			
		else {// go left
			return search(listOfNumbers, target, sI, mid-1);
		}
			
	}

	@Override
	public int search(int[] listOfNumbers, int target) {
		// TODO Auto-generated method stub
		return 0;
	}

}