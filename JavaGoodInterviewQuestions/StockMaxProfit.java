public class StockMaxProfit{


	public static void main(String [] args){

		StockMaxProfit maxprofit= new StockMaxProfit();

		int[] stocks  = new int[]{1,10,2,11,3,7};
		maxprofit.calculateMaxProfit(stocks);
	}

	private int calculateMaxProfit(int[] prices){


	int profitMax=0;
	int max=0;
	int length=prices.length;

	for(int i = length;i > 0; i--){
  		int current =  prices[i-1];
		System.out.println("Current : "+ current + "Max : "+ max);
  		
  		if(max < current){
  			max =  current;
  		}else{
  			profitMax = profitMax +  (max - current);
			System.out.println("Max profit possible is"+ profitMax);

		}

	}
	System.out.println("Max profit possible is"+ profitMax);
  	return profitMax;

	}
}

			System.out.println("Max profit possible is"+ profitMax);
// Complexity O(n).