import java.util.Scanner;
public class d155 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){

		String a = scanner.next();//�K����

		String b = scanner.next();//�F��

		int play1 = 0;
		int play2 = 0;

		switch(a+" "+b){
			case "Paper Stone":
				play1++;
				System.out.println("�����");
			break;

			case "Scissors Paper" :
				play1++;
				System.out.println("�����");
			break;

			case "Stone Scissors" :
				play1++;
				System.out.println("�����");
			break;

			case "Scissors Stone":
				play2++;
				System.out.println("�F�����");
			break;

			case "Stone Paper" :
				play2++;
				System.out.println("�F�����");
			break;

			case "Paper Scissors" :
				play2++;
				System.out.println("�F�����");
			break;

			case "Game Over" :
				if(play2>play1){
					System.out.println("�d�G���w���_���o��");
				} else{
					System.out.println("�ä����ܸ�");
				}
			break;
		}
		// int play1 = 0;
		// int play2 = 0;
		// switch(a){

		// case "Scissors" :

		// 	switch(b){

		// 	case "Stone" :
		// 		System.out.println("�F�����");
		// 		play2++;
		// 		break;
		// 	case "Paper" :
		// 		System.out.println("�����");
		// 		play1++;
		// 		break;
		// 	}
		// 	break;
		// case "Stone" :

		// 	switch(b){


		// 	case "Paper" :
		// 		System.out.println("�F�����");
		// 		play2++;
		// 		break;
		// 	}
		// 	break;
		// case "Paper" :

		// 	switch(b){

		// 	case "Scissors" :
		// 		System.out.println("�F�����");
		// 		play2++;
		// 		break;
		// 	case "Stone" :
		// 		System.out.println("�����");
		// 		play1++;
		// 		break;
		// 	}
		// 	break;
		// case "Game" :

		// 	switch(b){
		// 	case "Over" :
		// 		if(play1>play2){
		// 			System.out.println("�d�G���w���_���o��");
		// 		}
		// 		else{
		// 			System.out.println("�ä����ܸ�");
		// 		}

		// 		System.exit(0);
		// 	}
		// }
		}
	}
}