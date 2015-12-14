#include <iostream>
#include<math.h>
using namespace std;

int main(void){
	
	int key = 0;
			
	while(cin >> key){
		bool key_switch = true;
		int min = 2;
		if(key % 2==0 && key!=2){
			key_switch = false;	
		}else{	
			for(min+1 ; min <= sqrt(key) ; min++){			
				if(key%min==0){
					key_switch = false;	
					break;
				}	
			}
		}
		if(key_switch){
			cout<<"質數"<<endl;
		} else{
			cout<<"非質數"<<endl;
		}		
	}
	system("pasue");
	return 0; 	
}
