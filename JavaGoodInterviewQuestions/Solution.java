//  Convert String into integers.


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
                    int newValue = Character.getNumericValue(valueAtIndex) * ( 10 ^ ( length -i -1 ) ) ;
                    finalValue = finalValue + newValue;
                }
            }
        if(decimalFlag){
            finalValue = finalValue / (10 ^ decimalIndex);
            
        }
        if(negativeFlag){
            finalValue =  -finalValue;
        }
     return finalValue;   
    }

    public static void main(String [] args){
    	Solution solution =  new Solution();
    	int answer = solution.myAtoi("2");
    	System.out.println("Answer is "+ answer);
    }
}