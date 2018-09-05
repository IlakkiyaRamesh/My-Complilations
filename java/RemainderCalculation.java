import java.util.Scanner;
public class RemainderCalculation{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter 2 numbers:");
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int rem=n1%n2;
        System.out.print("Remainder:"+rem);
    }
}