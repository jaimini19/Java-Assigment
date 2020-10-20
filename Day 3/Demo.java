import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		
		int marks1, marks2, marks3, marks4,marks5;
        int fullmarks= 500;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks of 5 subject out of 100");
		marks1=sc.nextInt();
		marks2=sc.nextInt();
		marks3=sc.nextInt();
		marks4=sc.nextInt();
		marks5=sc.nextInt();
		
		int total= marks1 + marks2 + marks3 + marks4 + marks5;
		
		float perentage = (total  * 100) / fullmarks;
		
		if(perentage >= 90.0) {
			System.out.println("You have A grade with "+ perentage + "%");	
		}
		else if(perentage < 90.0 && perentage >= 80.0) {
			System.out.println("You have B grade with "+ perentage + "%");
		}
		else if(perentage < 80.0 && perentage >= 70.0) {
			System.out.println("You have C grade with "+ perentage + "%");
		}
		else if(perentage < 70.0 && perentage >= 60.0) {
			System.out.println("You have C grade with "+ perentage + "%");
		}
		else if(perentage < 60.0) {
			System.out.println("You have D grade with "+ perentage + "%");
		}
	}

}