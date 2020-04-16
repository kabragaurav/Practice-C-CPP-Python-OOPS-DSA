/**
Write a complete java program to test whether a given number is a hexadecimal number or
not .if it is not, an exception should be throwns and processed by the program .the exception
must be user defined .the numbered must be assigned to string variable. String function
must be used to processing. Irrespective of whether the number is a hexadecimal number or
not the string ending the program must be printed on the screen.
*/
import java.util.Scanner;
class userException extends Throwable{
	private String num;
	userException(String num){
		this.num = num;
	}
	String disp(){
		return num;
	}
}
public class Hexa{
	public static void main(String[] args){
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		String sub = num.substring(0,2);
		try{
			if(sub.compareTo("0x")!= 0){
				userException ue = new userException(num);
				throw ue;
			}
		}
		catch(userException ue){
			System.out.println(ue.disp()+" is not hexadecimal");
		}
		finally{
			System.out.println(num+" was entered");
		}
		}
	}