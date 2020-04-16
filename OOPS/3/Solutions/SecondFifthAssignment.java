/**
A method named add () accepts an array of strings as its argument. It converts these to
db values and returns their sum. The method generates a NumberFormatExeption if an
element is incorrectly formatted. It can also throw and create a CustomException,
RangeException, if an element is less than 0 or greater than 1.Write a program that illustrates
how to declare and use this method. Invoke the method from main ().Catch any exceptions
that are thrown and display an informative message for the user. Also provide a finally block
to thank the user for using the program.
*/
class RangeException extends Throwable{

}
class SecondFifthAssignment extends Exception{
	static void add(String[] args){
		Double sum = 0.0;
		Double db = 0.0;
		try{
			for(int i=0;i<args.length;i++){
				db = Double.parseDouble(args[i]);
				if(db<0.0 || db >1.0){
					throw new RangeException();
				}
				sum += db;
			}
			System.out.println(sum);
		}
		catch(NumberFormatException nfe){
			System.out.println("nfe thrown");
		}
		catch(RangeException re){
			System.out.println("re thrown");
		}
		finally	{
			System.out.println("Thanks for using");

		}				
	}

	public static void main(String [] args){
			add(args);
	}
}