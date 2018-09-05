import java.util.Scanner;
public class SumOfNumbers{
    public static void main(String args[]){
        int sum=1,i;
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number:");
        int n=scan.nextInt();

        sum of numbers
        for(i=1;i<=n;i++){
            sum+=i;            
        }System.out.println(sum);
    }
}
        