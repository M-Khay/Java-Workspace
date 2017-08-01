public class LETutorial{

	public interface MathOperation{
		public int operation(int a, int b);
	}

	public interface PrintExpression{
		public void sayHello();
	}


	public static void main(String [] args){

		MathOperation addition = (int a, int b) ->{return  a+b;};
		LETutorial tutorial = new LETutorial();
		int result = tutorial.operate(10,20,addition);
		System.out.println("Result of addition is"+result);

		tutorial.HelloWorldOfLabda(() ->{ System.out.println("hello World  of lambda, you are beautiful AF") ;System.out.println("hello World  of lambda, you are beautiful AF");});

		PrintExpression printExpression = () ->{System.out.println("hello World");};
		printExpression.sayHello();
	}

	public int operate(int a, int b, MathOperation mathOperation){
		int result= mathOperation.operation(a,b);
		return result;

	}

	public void HelloWorldOfLabda(PrintExpression expression){
		expression.sayHello();
	}
}