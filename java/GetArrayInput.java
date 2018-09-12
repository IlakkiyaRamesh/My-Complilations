import java.util.Scanner;
public class GetArrayInput{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);       
        System.out.print("Enter a array size:");
        int size=scan.nextInt();
        int a[]=new int[size];
        int i;
        
        for(i=0;i<size;i++){
            a[i]=scan.nextInt();
        }
        System.out.print("Array: ");
        for(i=0;i<size;i++){
            if(i<size-1){
                System.out.print(a[i]+" ");
            }
            else{
                System.out.print(a[i]);
            }
        }
 
    }
}