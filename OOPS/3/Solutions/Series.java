/**
Program calculates the sin(x) and cos(x) functions by computing the sin series and cos series functions
using thread techniques. (sin(x) and cos(x) calculate using Math class).
*/
import java.util.*;
import java.util.Scanner;
class Series extends Thread{
	void sine(double d1){
		System.out.println(Math.sin(d1));
	}
	void cosine(double d2){
		System.out.println(Math.cos(d2));
	}
	public void run(){
		System.out.println("Enter x");
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		sine(d);
		cosine(d);
	}
	public static void main(String[] args){
		Thread t = new Thread(new Series());
		t.start();
		try{
		t.join();
		}
		catch(Exception ex){}
	}
}
