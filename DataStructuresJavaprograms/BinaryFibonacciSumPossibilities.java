import java.util.ArrayList;
import java.util.HashMap;

public class BinaryFibonacciSumPossibilities {

	public static final String SEPERATOR = "'";
	public static long count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 150;/////////////////////////Enter the number here
		HashMap<Integer, Integer> newHash = new HashMap<>();
		ArrayList<Integer> array = new ArrayList<>(sum/2);
		for (int i=0; i<=sum; i++) {
			newHash.put(i, null);
		}
		getFibSeriesArray(sum, newHash, sum);
		for (int i=1;i<newHash.keySet().size(); i++) {
			if(newHash.get(i)!=null && newHash.get(i)>=0)array.add(i-1, newHash.get(i));
			else {
				break;
			}
		}
		System.out.println(array);
		HashMap<String, String> combinationHash = new HashMap<>();
		String combination = "";
		for(int i=array.size()-1;i>=0;i--) {
			getSum(array, i, sum, combination, combinationHash);
			combination = combination+"0";
		}
		System.out.println(combinationHash.keySet());
	}
	
	public static void getSum(ArrayList<Integer> array, int i, int sum, String combination, HashMap<String, String> hash) {
		for(int index=i;index>=0; index--) {
			int valueAtIndex = array.get(index);
			sum = sum - valueAtIndex;
			if(sum==0) {
				String c = combination;
				if(c.length()==0)c = valueAtIndex+"";
				else c = valueAtIndex + SEPERATOR+c;
				int prefix = array.size() - c.split(SEPERATOR).length;
				for(int j = 0;j<prefix;j++) {
					c="0"+SEPERATOR+c;
				}
				hash.put(c, c);
				if(combination.length()==0)combination = 0+"";
				else combination = 0 + SEPERATOR+combination;
				sum = sum + valueAtIndex;
				getSum(array, index-1, sum, combination, hash);
			}else if(sum>0) {
				if(combination.length()==0)combination = valueAtIndex+"";
				else combination = valueAtIndex + SEPERATOR+combination;
				getSum(array, index-1, sum, combination, hash);
			}else if(sum<0) {
				if(combination.length()==0)combination = 0+"";
				else combination = 0 + SEPERATOR+combination;
				sum = sum + valueAtIndex;
				//System.out.println("here");
				getSum(array, index-1, sum, combination, hash);
			}
		}
	}
	
	public static int getFibSeriesArray(int n, HashMap<Integer, Integer> hash, int x) {
		try {
			if(hash.get(n)==null) {
				if(n<=1)hash.put(n, n);
				else if(n>1) {
					int number = getFibSeriesArray(n-1, hash, x) + getFibSeriesArray(n-2, hash, x);
					if(x>=number)hash.put(n, number);
				}
			}
			return hash.get(n);
		} catch (NullPointerException e) {
			// TODO: handle exception
			return 0;
		}
	}

}
