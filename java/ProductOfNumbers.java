import java.util.Scanner;
public class ProductOfNumbers{ //Factorial
    public static void main(String args[]){
        int fact=1,i;
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number:");
        int n=scan.nextInt();

        product of numbers
        for(i=1;i<=n;i++){
            fact*=i;            
        }System.out.println(fact);
    }
}