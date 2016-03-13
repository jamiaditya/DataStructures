import java.util.ArrayList;


public class MergeSort {

	public static void merge(int[] array, int l, int m, int r){
		int n1 = m-l+1;//size of array1
		int n2 = r-m;
		int i,j,k;
		//int[] L={},R={};
		ArrayList<Integer> L = new ArrayList<Integer>();
		ArrayList<Integer> R = new ArrayList<Integer>();
		for(i=0; i<n1;i++){
			L.add(array[l+i]);
		}
		for(j=0;j<n2;j++){
			R.add(array[m+j+1]);
			
		}
		i=0;
		j=0;
		k=l;
		while(i<n1&&j<n2){
			if(L.get(i)<=R.get(j)){
				array[k]=L.get(i);
				i++;
			}else{
				array[k]=R.get(j);
				j++;
			}
			k++;
		}
		while(i<n1){
			array[k]=L.get(i);
			i++;
			k++;	
		}
		while(j<n2){
			array[k]=R.get(j);
			j++;
			k++;	
		}
		
		
	}
	public static void mergeSort(int[] arrayToBeSorted, int l, int r){
		if(l<r){
			int m = l+(r-l)/2;
			mergeSort(arrayToBeSorted, l, m);
			mergeSort(arrayToBeSorted, m+1, r);
			merge(arrayToBeSorted, l,m,r);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,4,3,6,5,7,8};
		mergeSort(array, 0, array.length-1);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

}
