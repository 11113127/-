#include <iostream>
#include <cstdlib>
using namespace std;

int main(void){
	
	int key = 0;
	cin >> key;


	
	for(int x = 1 ; x <= key ; x++){
		int round = 0;
		cin >> round;
		int sum = 0;
		int avg = 0;
		int best_speed = 1000000;
		for(int y = 0; y < round ; y++){
			int min = 0;
			int sec = 0;
			cin >> min;
			cin >> sec;
			
			sum+=((min*60)+sec);	
			if(best_speed>(min*60+sec))
				best_speed = (min*60+sec);
			avg=sum/round;	
				
		}
		cout<<"Track "<<x<<":"<<endl;
		cout<<"Best Lap: "<< best_speed/60<<" minute(s) "<<best_speed%60<<" second(s)."<<endl;
		cout<<"Average: "<< avg/60<<" minute(s) "<<avg%60<<" second(s)."<<endl; 
		cout<<endl; 	
	 
	}
	
	system("pasue");
	return 0; 	
}
