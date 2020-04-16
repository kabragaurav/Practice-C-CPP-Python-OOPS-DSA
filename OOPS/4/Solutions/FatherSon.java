/**
A bank account is operated by a father and his son. The account is opened with an initial deposit
of Rs. 600. Thereafter, the father deposits a random amount between Rs. 1 and Rs. 200 each time, until
the account balance crosses Rs. 2000.the son can start withdraws random amount only if the balance
exceeds Rs. 2000.thereafter, the son withdraws random amount between Rs 1 and Rs. 150, until the
balance goes below Rs. 500. Once the balances become less than Rs. 500, the father deposits amount
till it crosses Rs. 2,000 and the process continues. Write a Father Deposits amount till it crosses Rs.
2000 and the process continues. Write a father and son thread to carry out the above process.
(Program implement in C++ and JAVA).
**/
import java.util.Random;

class Q {
	int balance = 600;
	boolean valueSet = false;
	public void deposite(int amt) {
		while(valueSet){
			try {
				wait();
			} 
			catch (Exception e1) {
			}
		}
		balance += amt;
		System.out.println("Father : " + amt);
		if (balance > 2000) {
			System.out.println("-------   BALANCE : "+balance+"   --------");
			valueSet = true;
		}
	}

	public void withdraw(int amt) {
		while(!valueSet){
			try {
				wait();
			} 
			catch (Exception e1) {
			}
		}
		balance -= amt;
		System.out.println("Son: " + amt);
		if (balance < 500) {
			valueSet = false;
			System.out.println("-------   BALANCE : "+balance+"   --------");
		}
	}
}

class Father implements Runnable {
	Q q;
	Random rand;

	public Father(Q q) {
		this.q = q;
		rand = new Random();
		Thread t = new Thread(this, "Father");
		t.start();
	}

	public void run() {
		while (true) {
			q.deposite(rand.nextInt(200)+1);     // randInt(a) => 0..a-1
			try {
				Thread.sleep(1000);
			} catch (Exception e2) {
			}
		}
	}

}

class Son implements Runnable {
	Q q;
	Random rand;

	public Son(Q q) {
		this.q = q;
		rand = new Random();
		Thread t = new Thread(this, "Son");
		t.start();
	}

	public void run() {
		while (true) {
			q.withdraw(rand.nextInt(150)+1);
			try {
				Thread.sleep(1000);
			} catch (Exception e2) {
			}
		}
	}

}

public class FatherSon {
	public static void main(String[] args) {
		Q q = new Q();
		// anonymous obj
		new Father(q);
		new Son(q);
	}
}