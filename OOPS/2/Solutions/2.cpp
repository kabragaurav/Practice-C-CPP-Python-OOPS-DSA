#include<iostream>
using namespace std;
class Student
{
        private:
                char *correct;
        public:
                Student()
                {
                        correct = new char[8];
                        correct[0] = 'C';correct[1] = 'A';correct[2] = 'B';correct[3] = 'D';
                        correct[4] = 'B';correct[5] = 'C';correct[6] = 'C';correct[7] = 'A';
                }
                void getResult(char response[])
                {
                        int corr =0 , unanswered=0;
                        for(int i=0;i<8;i++)
                        {
                                if(response[i]=='X')
                                        unanswered++;
                                else if(response[i]==correct[i])
                                        corr++;
                        }
                        cout<<"QUESTION         "<<"reponse     "<<"Correct     "<<"Result      "<<endl;
                        for(int i=0;i<8;i++)
                        {
                                cout<<i<<"      "<<response[i]<<"      "<<correct[i]<<"      "<<(response[i]==correct[i]?"Correct":(response[i]=='X'?"Unanswered":"Wrong"))<<endl;
                        }
                        cout<<"Correct ans "<<corr<<" wrong "<<8-corr-unanswered<<" unans "<<unanswered<<endl;
                }
};


int main()
{
        Student s;
        char resp[8];
        cout<<"Enter response\n";
        for(int i=0;i<8;i++)
        {
                cin>>resp[i];
        }
        s.getResult(resp);
}
