import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;  

import java.util.logging.Logger;
import java.util.logging.Level;

/*
* Kush Ahuja
* To run this file open terminal and follow two steps.
* javac DialPadLetterCombinations.java
* java DialPadLetterCombinations
*/


public class DialPadLetterCombinations {
   
   
    private static final HashMap<Character,String> phoneDialPadMap = new HashMap<Character,String>(){{
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
    }} ;

 	private static final Logger LOGGER =
        Logger.getLogger(DialPadLetterCombinations.class.getName());

	private void printAllPermutationsForInputDigits(){
		List<String> result=null;

		String inputDigits = getAndVerifyUserInput();

		try{
			result = getListOfLettersPermutations(inputDigits);
		} catch(NullPointerException e){
			System.out.println("You entered invalid numbers or alphabets. Wanna try again? Y/N" );
			Scanner userInput = new Scanner(System.in);
			String restart = userInput.nextLine();
			if(restart.equalsIgnoreCase("y")){
				printAllPermutationsForInputDigits();
				System.exit(0);
			} else{
				  System.exit(0);
			}

		}	
		// Log the result on screen. 
	 	LOGGER.log(Level.INFO, "Possible words corresponding to input digits are:-\n"+result);

	}


    private String getAndVerifyUserInput(){
    	Scanner userInput = new Scanner(System.in);
		System.out.println("Enter digits pressed on dial pad between [2-9]");
		String digits = userInput.nextLine();

		// Since no alphabet is placed under one, it needs to be checked. "" should not be used to map agaist 1.
		while(digits.contains("1") ||digits.contains("0") ){

	 	LOGGER.log(Level.INFO, "Enter selected digits between [2-9] only");
		userInput = new Scanner(System.in);
		digits = userInput.nextLine();

    	}
    	return digits;
	}


	//  Returning List so that the result can be used in any form ArrayList, Set etc..
    private List<String> getListOfLettersPermutations(String inputDigits) throws NullPointerException{
		
		String letters;
       	int inputSize = inputDigits.length();	

        List<String> result = new ArrayList<String>();  
        List<String> nextResult = new ArrayList<String>();

        result.add("");

        for(int i=0;i<inputSize;i++){
            for( String str : result){ 
                letters = phoneDialPadMap.get(inputDigits.charAt(i));
                for(int j=0;j<letters.length();j++){
                    nextResult.add(str+letters.charAt(j));
                }
               }
            result  = nextResult;
            nextResult = new ArrayList<String>();
        
        }      
        return result;
    }
	
	public static void main (String[ ] args){
	
		DialPadLetterCombinations solution = new DialPadLetterCombinations();

		printAllPermutationsForInputDigits();

	}

	// To complete the question specific to our need ie.. to build the swift keyboard  we need to use a dictionary as well, 
	// so as to show only meaningful words in result. Using some 3rd party library like 

	// this could be on of the open source library we can integrate. Its build with java 1.5 but compatible until 1.8
	/**
	*   http://projects.csail.mit.edu/jwi/
	*/
}