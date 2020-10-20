import java.util.Scanner;
class Avenger{
    
         String name,weapon,planet,power;
         int age;
         Scanner sc=new Scanner(System.in);
         public void getDetails()
         {
                System.out.println("Enter name");
                name=sc.nextLine();
                
                System.out.println("Enter age");
		        age=sc.nextLine();
		
		        System.out.println("Enter Your power");
		        power=sc.nextLine();
		
		        System.out.println("Enter Your weapon");
		        weapon=sc.nextLine();
		
		        System.out.println("Enter your planet");
		        planet=sc.nextLine();

         }
        public void displayDetails()
	    {
		  System.out.println("Hello "+name+", your age is "+age+", your power is "+power+", weapon is "+weapon+" and you are from "+planet+".");
	    }

      
    }
    public class AvengerMain {

        public static void main(String[] args){
    
            Avenger[] avengers=new Avenger[5];
    
            for(int i=0; i<5; i++)
            {
    
                avengers[i]=new Avenger();
            
                avengers[i].getDetails();
    
            }
            
            for(int i=0; i<5; i++)
            {
    
                
                avengers[i].displayDetails();
             
            }
    
            System.out.println();
    
        }
    
    }