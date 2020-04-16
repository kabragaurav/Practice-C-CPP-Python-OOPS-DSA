#include<iostream>
using namespace std;
class Data
{
	int day,month,year;
	
	public:
		Data()
		{
			day = 12;
			month = 3;
			year = 1993;
		}
		Data(int day = 12,int month = 10,int year = 2000)
		{
			cout<<"Parameterised with default args\n";
			this->day = day;
			this->month = month;
			this->year = year;
		}
		Data(const Data &data)
		{
			cout<<"Copy constructor\n";
			day = data.day;
			month = data.month;
			year = data.year;
		}
		void showData()
		{	
			cout<<this->day<<" "<<this->month<<" "<<this->year<<endl;
		}
};

int main()
{
	Data d2(9,9,1999);
	Data d3 = d2;
	d3.showData();
}
