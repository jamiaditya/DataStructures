import java.util.ArrayList;


public class InsersionSort {

	public static void insersionSort(ArrayList<Integer> array, int size){
		int i,j, key;
		for(i=1;i<size;i++){
			key = array.get(i);
			j=i-1;
			while(j>=0 && array.get(j)>key){
				array.set(j+1, array.get(j));
				j = j-1;
			}
			array.set(j+1, key);
			
		}
		System.out.println(array.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(4);
		array.add(2);
		array.add(5);
		array.add(1);
		System.out.println(array.toString());
		insersionSort(array, array.size());
		System.out.println(array.toString());
	}

}
