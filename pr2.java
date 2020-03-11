[200~^
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
pr2.java [unix] (08:59 01/01/1970)                                      0,1 모두
-- 끼워넣기 --                                                       ^V
^
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
pr2.java [unix] (08:59 01/01/1970)                                      0,1 모두
-- 끼워넣기 --                                                       ^V
package ex1.io;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print(" 정수 A 입력 : ");int num1=scan.nextInt();
		System.out.print(" 정수 B 입력 : ");int num2=scan.nextInt();
		int change; //만약 A값이 크다면 바꿔줄 변수 
		int print=num1;
		do {
			if(num1>num2)
			{
				print=num2;
				change=num1;
				num1=num2;
				num2=change;
			}
			System.out.print(print+" ");
			print++;
		} while(print<=num2);
	}
}

