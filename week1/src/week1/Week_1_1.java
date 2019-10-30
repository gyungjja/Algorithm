package week1;
import java.util.Scanner;	//Scanner 함수를 줘서 입력

public class Week_1_1 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);	//input 객체를 생성
		
		System.out.print("Input value : ");
		int n = input.nextInt();	//변수 n은 정수형 
		System.out.println(n + " Loop Factorial result : " + loopFactorial(n));	//출력
		System.out.println(n + "Recursion Factorial result : "+ recFactorial(n));	//출력
	}
	static int loopFactorial(int n)	//반복재귀
	{
		int result = 1;	//초기값 1 설정
		for(int i =1; i<= n; i++)	//n까지 
		{
			result *=i;	//결과값 * i
		}
		return result;	//결과 반환
	}
	
	static int recFactorial(int n) //순황함수
	{
		if(n <=1) return 1;	//1이 나오면 실행 종료
		else return n * recFactorial(n-1);	//팩토리얼 특성상 반복
	}
}