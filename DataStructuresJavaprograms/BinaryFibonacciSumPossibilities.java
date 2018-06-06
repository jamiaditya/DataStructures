import java.util.ArrayList;
import java.util.HashMap;

public class BinaryFibonacciSumPossibilities {

	public static final String SEPERATOR = "'";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 100;/////////////////////////Enter the number here
		HashMap<Integer, Integer> newHash = new HashMap<>();
		ArrayList<Integer> array = new ArrayList<>();
		getFibSeriesArray(sum, newHash, sum);
		for (int i=1;i<newHash.keySet().size(); i++) {
			if(newHash.get(i)!=null)array.add(i-1, newHash.get(i));
		}
		//System.out.println(newHash.keySet());
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
			//System.out.println(sum+" "+valueAtIndex);
			if(sum==0) {
				String c = combination;
				if(c.length()==0)c = valueAtIndex+"";
				else c = valueAtIndex + SEPERATOR+c;
				int prefix = array.size() - c.split(SEPERATOR).length;
				//System.out.println(array.size() + "" + c.split(SEPERATOR).length);
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
				getSum(array, index-1, sum, combination, hash);
			}
		}
	}
	
	public static int getFibSeriesArray(int n, HashMap<Integer, Integer> array, int x) {
		if(n==0) {
			array.put(n, 0);
			return 0;
		}else if(n==1) {
			array.put(n, 1);
			return 1;
		}
		if(array.get(n)!=null)return array.get(n);
		int number = getFibSeriesArray(n-1, array, x) + getFibSeriesArray(n-2, array, x);
		//System.out.println(x+"  "+number);
		if(x>=number)array.put(n, number);
		return number;
	}

}
