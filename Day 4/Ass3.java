import java.util.*;
class Ass3{
    public static void main(String[] args) {
        int a1[] = new int[5];
        int sum =0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("\nEnter the 5 elements ");

            a1[i] = sc.nextInt();
        }
        for(int j=0;j<5;j++)
        {
            sum = sum + a1[j];
        }
    
        System.out.print("\nSum of all Elements : " +sum);

    }
}