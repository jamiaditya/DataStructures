public class FindElementInSquareMatrixReccursiveReccursive{

     public static void main(String []args){
        int[][] array = {{1,2,3},{2,3,4},{3,4,5}};
        System.out.println(array[0][2]);
        FindElementInSquareMatrixReccursive.doSearch(array,0,array.length-1,array.length-1,6);
     }
     public static void doSearch(int[][] array, int row, int col, int size, int x){
         if(row>size || col>size){
             System.out.println("Element Not Found");
             return;
         }
         if(array[row][col]==x){
             System.out.println("Found "+x+" at "+row+" Row and "+col+"Column");
         }else if(x>array[row][col]){
             FindElementInSquareMatrixReccursive.doSearch(array, row+1, col, size, x);
         }else if(x<array[row][col]){
             FindElementInSquareMatrixReccursive.doSearch(array,row,col-1,size,x);
         }
     }
}
