from collections import defaultdict
dc = defaultdict(float)

class List:
	def __init__(self):
		self.ls = [int(x) for x in input().split()]
		self.k = int(input())
	def process(self):
		for x in self.ls:
			dc[x] += 1

		for key in list(dc.keys()):
			x = key
			diff = self.k-x
			if dc[diff]:
				print(True)
				print("Numbers are ",x," and ",diff)
				break
		else:
			print(False)
l = List()
l.process()
	
'''
ELSE sort() and use binary search
using namespace std;

int main() {
	//code
	int T;
	cin>>T;
	while(T--)
	{
	    int N,diff;
	    cin>>N>>diff;
	    vector<int> v;
	    int num;
	    for(int i=0;i<N;i++)
	    {
	        cin>>num;
	        v.push_back(num);
	    }
	    bool flag=false;
	    sort(v.begin(),v.end());
	    for(int i=0;i<=N-1;i++)
	    {
	        int x=v[i];
	        int next=diff-x;
	        if(binary_search(v.begin()+i+1,v.end(),next))
	        {
	            flag=true;
	            cout<<"Yes"<<endl;
	            break;
	        }
	    }
	    if(flag==false)
	        cout<<"No"<<endl;
	}
	return 0;
}
'''
