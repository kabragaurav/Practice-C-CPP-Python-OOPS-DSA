#include<iostream>
#include<vector>
#include<string>
#include<utility>
#include<algorithm>
using namespace std;


bool mySort(pair<char,int> &a,pair<char,int> &b)
{
        if(a.second==b.second)
                return a.first<b.first;
         return a.second>b.second;
}

int main()
{
        string str;
        getline(cin,str);
        vector<pair<char,int> > v;
        for(int i=0;i<26;i++)
        {
               v.push_back(make_pair('A'+i,0));
        }
        for(int i=0;i<str.length();i++)
        {
                if(str[i]>='A' && str[i]<='Z')
                {
                        v[str[i]-'A'].second++;
                }
        }
        sort(v.begin(),v.end(),mySort);
        cout<<v[0].first<<endl;
}
