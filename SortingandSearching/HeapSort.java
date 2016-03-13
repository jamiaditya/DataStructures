
public class HeapSort {

	     public static void maxHeapify(int[] array, int size){
	         int idx = size-1;
	         for(int i = idx;i>=0;i--){
	             if(((i-1)/2)>=0){
	                 if(array[i]>array[(i-1)/2]){
	                     int temp = array[i];
	                     array[i] = array[(i-1)/2];
	                     array[(i-1)/2] = temp;   
	                 }
	             }
	         }
	         int temp = array[0];
	         array[0]=array[size-1];
	         array[size-1]= temp;
	     }
	     public static void heapSort(int[] array){
	         for(int i=array.length-1;i>0;i--){
	             maxHeapify(array, i);
	         }
	         for(int j=0;j<array.length;j++){
	            System.out.println(array[j]);
	         }
	     }
	     public static void main(String []args){
	        int[] array= {2,3,4,1,7,5,9,10};
	        heapSort(array);
	     }
	}


