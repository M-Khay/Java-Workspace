// Not yet working correctly for string with decimals	
	public class Solution {
	    public int myAtoi(String str) {
	        int length = str.length();
	        
	        boolean negativeFlag=false, decimalFlag=false;
	        int decimalIndex=0;
	        int finalValue =0 ;
	        char valueAtIndex;
	        
	            for(int i =0 ; i < length; i ++){
	                valueAtIndex = str.charAt(i);
	                if(valueAtIndex == '-'){
	                    negativeFlag= true;
	                }else if(valueAtIndex == '.'){
	                    decimalFlag = true;
	                    decimalIndex =  length -i -1;
	                }else{
	                	int index =   length -1 -i  ;
	                	double base10Value = Math.pow(10,index);
	                    int newValue = (int) (((int) Character.getNumericValue(valueAtIndex)) * base10Value);
	                    finalValue = finalValue + newValue;
	                }
	            }
	        if(decimalFlag){
	        	double decimalBase10Value = Math.pow(10, decimalIndex); 
	            finalValue = (int) (finalValue / decimalBase10Value);
	            
	        }
	        if(negativeFlag){
	            finalValue =  -finalValue;
	        }
	     return finalValue;   
	    }
	
	    public static void main(String [] args){
    	Solution solution =  new Solution();
    	int answer = solution.myAtoi("2.2");
    	System.out.println("Answer is "+ answer);
    }
}