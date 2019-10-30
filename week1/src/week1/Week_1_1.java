package week1;
import java.util.Scanner;	//Scanner �Լ��� �༭ �Է�

public class Week_1_1 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);	//input ��ü�� ����
		
		System.out.print("Input value : ");
		int n = input.nextInt();	//���� n�� ������ 
		System.out.println(n + " Loop Factorial result : " + loopFactorial(n));	//���
		System.out.println(n + "Recursion Factorial result : "+ recFactorial(n));	//���
	}
	static int loopFactorial(int n)	//�ݺ����
	{
		int result = 1;	//�ʱⰪ 1 ����
		for(int i =1; i<= n; i++)	//n���� 
		{
			result *=i;	//����� * i
		}
		return result;	//��� ��ȯ
	}
	
	static int recFactorial(int n) //��Ȳ�Լ�
	{
		if(n <=1) return 1;	//1�� ������ ���� ����
		else return n * recFactorial(n-1);	//���丮�� Ư���� �ݺ�
	}
}