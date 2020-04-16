/**
Create a class that has static method main(),a(),b(),c() and d().The main() method invokes a() method
a() invokes b(),method b() invokes c(),method c() invokes d().Method d() declares a local array with
10 elements and then attempts to access the element at position .therefore an
ArrayIndexOutOfBoundsException is generated. Each method has a catch block for this type of exception
and a finally block .The catch blocks in c() and d() contain a throw statement to propagate this exception
to their caller.
*/

class Chain extends Exception{
	static void a(){
		try{
			b();
		}
		catch(ArrayIndexOutOfBoundsException aiobe){
		}
		finally{
			System.out.println("a() called");
		}
	}
	static void b(){
		try{
			c();
		}
		catch(ArrayIndexOutOfBoundsException aiobe){
			throw aiobe;
		}
		finally{
			System.out.println("b() called");
		}
	}
	static void c(){
		try{
			d();
		}
		catch(ArrayIndexOutOfBoundsException aiobe){
			throw aiobe;
		}
		finally{
			System.out.println("c() called");
		}
	}
	static void d(){
		int[] arr = {1,2,3,4,5,6,7,8,9,0};
		try{
			int t = arr[10];
		}
		catch(ArrayIndexOutOfBoundsException aiobe){
			throw aiobe;
		}
		finally{
			System.out.println("d() called");
		}
	}
	public static void main(String [] args){
		try{
			a();
		}
		catch(ArrayIndexOutOfBoundsException aiobe){
		}
		finally{
			System.out.println("main() called");
		}
	}
}