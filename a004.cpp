#include <iostream>
#include <cstdlib>
using namespace std;

int main(void){

int year = 0;
	while(cin >> year){
		if (((year%4 == 0) && (year%100 != 0 )) || (year%400 == 0) ){
			cout<<"¶|¦~"<<endl;
		}else{
			cout<<"¥­¦~"<<endl;
		}
	}
	system("pause");
	return 0;
}
