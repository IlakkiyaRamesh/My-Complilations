import java.util.Scanner;
public class Sequence1{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number upto which whole numbers to be printed:");
        int n=scan.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(i);
        }
    }
}