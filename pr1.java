[200~package ex1.io;
import java.util.Scanner;
import java.util.Random;
public class Program {

		public static void main(String[] args) {
				
					Random rand = new Random();
							Scanner scan = new Scanner(System.in);
									int answer = (rand.nextInt(90)+10);
											int num;
													do {
																	System.out.print("두 자리 정수 입력 : ");
																				num = scan.nextInt();
																							
																							if(num>answer)
																											{
																																System.out.println("정답 보다 값이 큽니다..");
																																			}
																										else if (num<answer)
																														{
																																			System.out.println("정답 보다 값이 작습니다..");
																																						}
																													else
																																		System.out.println("정답입니다..");
																															} while(num!=answer);
														}
}

