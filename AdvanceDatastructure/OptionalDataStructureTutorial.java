import java.util.Optional;
public class OptionalDataStructureTutorial{

	Optional<String> stringOptional ;

	Optional<Integer> integerOptional;


	public static void main(String[] args){
		OptionalDataStructureTutorial tutorial = new OptionalDataStructureTutorial();

		tutorial.stringOptional = Optional.empty();

		tutorial.integerOptional = Optional.empty();

		if(tutorial.stringOptional.isPresent()){

		}else{
		System.out.println("Current value of stringOptional is null");
		}

		tutorial.stringOptional = Optional.of("I'm Khay");

		System.out.println("Now the stringOptional has value "+ tutorial.stringOptional.get());
	}
}