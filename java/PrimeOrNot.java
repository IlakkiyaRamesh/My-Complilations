import java.util.Scanner;
public class PrimeOrNot{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number:");
        int n=scan.nextInt();
        if(n>0){
            for(int i=2;i<n;i++){
                if(n%i!=0){
                    System.out.println(n+" is a prime number.");
                    break;
                }  
                else{
                    System.out.println(n+" is not a prime number.");
                    break;
                }            
            }
        }
        else{
            System.out.println("Enter a positive number.");
        }
    }
}  