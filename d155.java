import java.util.Scanner;
public class d155 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){

		String a = scanner.next();//¤K¶³µµ

		String b = scanner.next();//ÆF¹Ú

		int play1 = 0;
		int play2 = 0;

		switch(a+" "+b){
			case "Paper Stone":
				play1++;
				System.out.println("µµÀò³Ó");
			break;

			case "Scissors Paper" :
				play1++;
				System.out.println("µµÀò³Ó");
			break;

			case "Stone Scissors" :
				play1++;
				System.out.println("µµÀò³Ó");
			break;

			case "Scissors Stone":
				play2++;
				System.out.println("ÆF¹ÚÀò³Ó");
			break;

			case "Stone Paper" :
				play2++;
				System.out.println("ÆF¹ÚÀò³Ó");
			break;

			case "Paper Scissors" :
				play2++;
				System.out.println("ÆF¹ÚÀò³Ó");
			break;

			case "Game Over" :
				if(play2>play1){
					System.out.println("´dºGªºÄw±¹°_­»ªo¿ú");
				} else{
					System.out.println("¿Ã¤õªºÂÜ¸ñ");
				}
			break;
		}
		// int play1 = 0;
		// int play2 = 0;
		// switch(a){

		// case "Scissors" :

		// 	switch(b){

		// 	case "Stone" :
		// 		System.out.println("ÆF¹ÚÀò³Ó");
		// 		play2++;
		// 		break;
		// 	case "Paper" :
		// 		System.out.println("µµÀò³Ó");
		// 		play1++;
		// 		break;
		// 	}
		// 	break;
		// case "Stone" :

		// 	switch(b){


		// 	case "Paper" :
		// 		System.out.println("ÆF¹ÚÀò³Ó");
		// 		play2++;
		// 		break;
		// 	}
		// 	break;
		// case "Paper" :

		// 	switch(b){

		// 	case "Scissors" :
		// 		System.out.println("ÆF¹ÚÀò³Ó");
		// 		play2++;
		// 		break;
		// 	case "Stone" :
		// 		System.out.println("µµÀò³Ó");
		// 		play1++;
		// 		break;
		// 	}
		// 	break;
		// case "Game" :

		// 	switch(b){
		// 	case "Over" :
		// 		if(play1>play2){
		// 			System.out.println("´dºGªºÄw±¹°_­»ªo¿ú");
		// 		}
		// 		else{
		// 			System.out.println("¿Ã¤õªºÂÜ¸ñ");
		// 		}

		// 		System.exit(0);
		// 	}
		// }
		}
	}
}