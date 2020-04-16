import java.util.Scanner;
class Student
{
	private int admno;
	private String Name;
	private float marksEng,marksMaths,marksSci,total;
	public void readData()
	{
		System.out.println("Enter admNo,name,3 subject marks");
		Scanner sc = new Scanner(System.in);
		admno = sc.nextInt();
		Name = sc.next();
		if(Name.length() >20)
			Name = Name.substring(0,20);
		marksEng = sc.nextFloat();
		marksMaths = sc.nextFloat();
		marksSci = sc.nextFloat();
		compute();
	}
	public void compute()
	{
		total = marksEng+marksMaths+marksSci;
	}
	public void showData()
	{
		System.out.println("The data values...");
		System.out.println(admno+" "+Name+" "+total);
	}
}
