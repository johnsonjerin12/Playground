#include<iostream>
#include<cstring>
#include<string>
using namespace std;

int main()
{
    string in,out;
    getline(cin,in);
    out=in;
    int loc=-6;
    while (true)
    {
        loc=in.find("the ");
        if(loc<0)
            break;
        else
            in.replace(loc,4,"");
    }
    cout<<in;
}