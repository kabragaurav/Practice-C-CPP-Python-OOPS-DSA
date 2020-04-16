#include<iostream>
#include<algorithm>
using namespace std;
class Student
{
	private:
		int rollno;
		string Name;
		float marks[4];
		float grade;
	public:
		void calculate()
		{
			cout<<"%\\ge marks : ";
			grade = (marks[0]+marks[1]+marks[2]+marks[3])/4.0;
			displayData();
		}
		void readData()
		{
			again:
				cout<<"Enter rollno,name,4 subject marks\n";
				cin>>rollno>>Name>>marks[0]>>marks[1]>>marks[2]>>marks[3];
				if(Name.length()>20)
					goto again;
				calculate();
		}
		void displayData()
		{
			cout<<"Details...\n";
			cout<<rollno<<" "<<Name<<" "<<grade<<endl;
		}
		string getName()
		{
			return this->Name;
		}
		void sortStudents(Student stu[],int strength)
		{
			sort(stu,stu+strength,sortNow);
		}
		static bool sortNow(Student &a, Student &b)
		{
			return a.getName()<b.getName();
		}
};
int main()
{
	int strength;
	cout<<"How many students?\n";
	cin>>strength;
	Student stu[strength];
	for(int i=0;i<strength;i++)
	{
		stu[i].readData();
	}
	stu[0].sortStudents(stu,strength);
	cout<<"After sorting...\n";
	for(int i=0;i<strength;i++)
	{
		stu[i].displayData();
	}
}
