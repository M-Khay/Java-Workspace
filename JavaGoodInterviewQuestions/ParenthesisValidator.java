import java.util.*;
public class ParenthesisValidator{

	public static void main(String [] args){
		ParenthesisValidator validator = new ParenthesisValidator();
		validator.validate("({})");

	}

	public void validate(String expression){
		Stack<Character> expressionStack = new Stack<Character>();
		int length = expression.length();
		char expressionOnTop;
		for(int i = 0 ; i < length ; i++){

			char currentBracket =  expression.charAt(i);

			switch(currentBracket){

				case '{': 
				expressionStack.push(currentBracket);
				break;

				case '[':
				expressionStack.push(currentBracket);

				break;

				case '(': 
				expressionStack.push(currentBracket);
				break;

				case '}': 
				 expressionOnTop = (char)expressionStack.pop();
				if(expressionOnTop == '{'){
					continue;
				}else{
					System.out.println("Error missing }");
				}
				break;

				case ']':

				expressionOnTop =(char) expressionStack.pop();
				if(expressionOnTop == '['){
					continue;
				}else{
					System.out.println("Error missing ]");
				}
				break;

				case ')': 

				 expressionOnTop =(char) expressionStack.pop();
				if(expressionOnTop == '('){
					continue;
				}else{
					System.out.println("Error missing )");
				}
				break;
			}


		}
	}
}