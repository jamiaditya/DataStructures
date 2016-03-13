
public class QuickSort {
	static int count =0;
	public static void sort(int[] array, int start, int end){
		
		if(start<end){
			int pivot = partition(array, start, end);
			sort(array,start, pivot-1);
			sort(array, pivot+1,end);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,3,2,6,5,9,8,4};
		sort(array,0,array.length-1);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	public static int partition(int[] array,int start,int end){
		int low = start;
		int high = end-1;
		int key = end;
		
		while(low<high){
			if(array[low]>array[key]){
				int temp;
				temp = array[high];
				array[high]=array[low];
				array[low] = temp;
				high--;
			}
			else if(array[low]<array[key]){
				low++;
			}
		}
		int temp1 = array[key];
		array[key]=array[high];
		array[high] = temp1;
		return high;
	}

}
