import java.util.Scanner;
public class Fibonacci{
    public static void main(String args[]){
        int a=0,b=1,c;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of elements to be generated in Fibonacci sequence:");
        int n=scan.nextInt();
        if(n==1){
            System.out.println(a);
        }
        else if(n==2){
            System.out.print(a+" "+b);
        }
        else if(n>2){
            System.out.print(a+" "+b);
            for(int i=0;i<n-2;i++){
                c=a+b;                
                System.out.print(" "+c);
                a=b;
                b=c;
            }
        }System.out.println();
    }    
}