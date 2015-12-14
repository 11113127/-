#include <iostream>
using namespace std;

int main(void){
	int count = 0 , x = 0 , min = 0;
	long long y = 0 , z = 0; 
	cin >> count;	
	
	//while(count>0){
	for (min;min<count;min++){
	
		cin >> x;
		cin >> y;
		cin >> z;
		switch(x){
			case 1:
				cout<<y+z<<endl;
				break;
			case 2:
				cout<<y-z<<endl;
				break;
			case 3:
				cout<<y*z<<endl;
				break;
			case 4:
				cout<<y/z<<endl;
				break;
		}
		//--count;		
	}
	system("pasue");
    return 0;
}
