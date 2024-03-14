#include <iostream>
#include <vector>
#include <set>
#include <unordered_set>
#include <stack>
using namespace std;

int main()
{
    vector<int> numbers =(1,100,10,70,100);
    set<int> numbers=(1,100,10,70,1000);
    cout<<"numbers are:";
    for(auto &num; numbers){
        cout<<num<<",";
    }
    return 0;
}