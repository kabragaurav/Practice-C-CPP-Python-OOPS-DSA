#include<thread>
#include<iostream>
#include<unistd.h>
using namespace std;
int balance = 600;
bool valueSet  = false;
void deposite(){
	srand(time(0));
	while(true){
		while(valueSet);
		while(balance<=2000){
			int r = rand()%200+1;
			balance += r;
			cout<<"Father : "<<r<<endl;
			sleep(1);
		}
		cout<<"-------- BALANCE : "<< balance <<" ----------\n";
		valueSet = true;
		sleep(2);
	}
}

void withdraw(){
	srand(time(0));
	while(true){
		while(!valueSet);
		while(balance>=500){
			int r = rand()%150+1;
			balance -= r;
			cout<<"Son : "<<r<<endl;
			sleep(1);
		}
		cout<<"-------- BALANCE : "<< balance <<" ----------\n";
		valueSet = false;
		sleep(2);
	}
}

int main(){
	thread father(deposite);
	thread son(withdraw);
	father.join();
	son.join();
}
