import java.util.Scanner;
public class OddOrEven{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        if(n%2==0){
            System.out.print(n+" is Even number");
        }
        else{
            System.out.print(n+" is odd number");
        }
    }
}