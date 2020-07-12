#include<iostream>
#include<string>
using namespace std;
int main() 
{ std::string jerin;
  std::getline(std::cin , jerin );
for(std::string::reverse_iterator
    i=jerin.rbegin() ; i<jerin.rend() ; i++){
  std::cout << *i;
}
}