public class LargestSumOfThreeNumberInArray{

	public static void main(String[] args ){

			LargestSumOfThreeNumberInArray largestSumOfThreeNumbersInArray = new LargestSumOfThreeNumberInArray();
			int [] input ={200,3,4,5,1,11,10};
			largestSumOfThreeNumbersInArray.findLargestSumOfThreeNumbers(input);
	}

	private void findLargestSumOfThreeNumbers(int [] input){

		int first=0,second=0,third=0;
		int inputLength = input.length;
		for(int i =0;i<inputLength;i++){
			int current = input[i];

			if(current>=first){

				third = second;
				second = first;
				first = current;
			}else if(current >=second){
				third = second;
				second = current;

			}else if(current>third){
				third = current;
			}


		}
			System.out.println("Largest sum is " + (first+second+ third));

	}
}
// ********************************************
//  There is another greedy approact shown on interview cake website, 
//  though this is much better soultion then that cuz of lesser number of comparisons and better memory utilization,
//  but its worth looking there if you wanna learn about greedy algorithms.