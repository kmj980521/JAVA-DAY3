package ex1.io;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);;
		int change; //만약 A값이 크다면 바꿔줄 변수 
		
		int a= scan.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			if(i%5==0)
			{
				System.out.println("*");
			}
			else
			{
			System.out.print("*");
			}
		}
		
	}
}

