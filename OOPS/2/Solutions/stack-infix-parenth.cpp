//evaluate fully parenthesized infix expr

#include<iostream>
#include<stack>
#include<string>
using namespace std;


int main()
{
	string str;
	cin>>str;
	stack<string> stk;
	for(int i=0;i<str.size();i++)
	{
		if(str[i]!=')')
		{
			//push
			stk.push(string(1,str[i]));
		}
		else
		{
			string b = stk.top();
			stk.pop();
			char oper = stk.top()[0];
			stk.pop();
			string a = stk.top();
			stk.pop();
			stk.pop();
			int x = stoi(a);
			int y = stoi(b);
			switch(oper)
			{
				case '+':
					stk.push(to_string(a+b));
					break;
				case '-':
					stk.push(to_string(a-b));
					break;
				case '*':
					stk.push(to_string(a*b));
					break;
				case '/':
					stk.push(to_string(a/b));
					break;
			}
		}
	}
	cout<<stk.top();
}
