import java.util.Scanner;

public class Sister{
	public static void main(String[] args){
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("scanf you age:");
		int age = scan.nextInt();
		
		
		if(age < 18){
			age = 0;
		}
		if(age >= 18){
			age = 1;
		}
		
		switch(age ){
			case 0:
			     System.out.println("you are young!");
				 break;
				 
			case 1:
			     System.out.println("you are old!");
				 break;
				 
				 
			default:
			     System.out.println("Please try again");
		}
		
	}
}