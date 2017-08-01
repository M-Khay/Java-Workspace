public class ProductOfAllExceptAtIndex{
	
	public static void main(String[] args){
		ProductOfAllExceptAtIndex findProdcut = new ProductOfAllExceptAtIndex();

		int input [] =  {1,7,3,4};
		findProdcut.getProductOfAllExceptElementAtIndex(input);

	}

	private void getProductOfAllExceptElementAtIndex(int[] input){

		int length = input.length;
		int[] output = new int[length];
		int productOfAll =1;

if(length == 0){
	return ;
}
		for(int i =0 ; i< length;i++){
			
			productOfAll  *= input[i];
		}

		for(int i =0; i<length ; i++){
			output[i] = (int)productOfAll/input[i];
			System.out.println(""+output[i]);
		}

	}
}