package ex1.io;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);;
		
		System.out.print("정숫값 : ");int a= scan.nextInt();
		
		for(int i=a;i>0;i--)
		{  
		        for(int j=i;j<a;j++)
		        {
		        	System.out.print(" ");
		        }
				for(int k=i*2-1;k>0;k--)
		        {
		                System.out.print("*");
		        }
		        System.out.println();
		}
		
	}
}


