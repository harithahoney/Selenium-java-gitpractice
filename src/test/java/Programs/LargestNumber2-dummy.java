package Programs;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			      int temp, size;
			      int array[] = {10, 20, 25, 63, 96, 57};
			      size = array.length;

			      for(int i = 0; i<size; i++ ){
			         for(int j = i+1; j<size; j++){
			            if(array[i]>array[j]){
			               temp = array[i];
			               array[i] = array[j];
			               array[j] = temp;
			            }
			         }
			      }
			      System.out.println("largest element is:: "+array[size-1]);
			   }
	
	
	//Added by te-2
			

	}


