package week11;

public class Sorting {
	
	// swap �޼���(��ġ�� �ٲپ���)
	public static void swap(int[] a, int j, int k){
		int temp = a[j];
		a[j] = a[k];
		a[k] = temp;
		
	}
	// ��������
	public static void selectionSort(int[] a){
		
		int i , j , min; // ��������.
		for(i = 0; i < a.length - 1; i++){ // Ž��
			for(j = i+1,min=i; j<a.length; j++){	//�ݺ�
				if(a[j] < a[min]) 	//���� ���� ���� ���� ���Һ��� ũ��
					min = j;	//���� ���� ���� min 
			}
			swap(a,min,i);	// �ڸ��ٲٱ�.
			System.out.println("=======Selection Sort========");
			System.out.println("Pass " + (i+1) + "=>");
			for(int k = 0; k < a.length; k++) { // ���
				System.out.print("| " + a[k] + " |");
				
			}
			System.out.println("\n");
			System.out.println("=============================");

			
		}
		
		
	}
	
	public static void bubbleSort(int[] a){
		int i , j , temp = 0;	//���� ����
		for(i = a.length-1; i >= 0 ; i--) {	//�ݺ� n-1��ŭ
			temp++;
			for(j=0; j < i; j++) {
				if(a[j]>a[j+1])	//ù��° ���Ұ� �ι�° ���Һ��� ũ��
					swap(a,j,j+1);	//��ȯ
				System.out.println("=======Bubble Sort========");
				System.out.println("Pass " + (temp) + "=>");
				for(int k = 0; k < a.length; k++) {	//���
					System.out.print("| " + a[k] + " |");
					
				}
				System.out.println("\n");
				System.out.println("=============================");
			}
			
			
		}
		
		
	}
	
	public static void insertionSort(int[] a){ // ����sort�޼ҵ屸��
		int i , j , temp; //��������.
		boolean move;	//�ڸ��̵� �Ǻ� ����
		
		for(i = 1; i < a.length; i++){
			temp = a[i];	
			j = i;			//�������� ������ �ޱ����ؼ� ����ϴ� �ӽú���.
			if(a[j-1] > temp)	//�տ� ���Ұ� �� ũ�� ������ �ش�.
				move = true; //��
			else
				move = false; //����
			while(move){
				a[j] = a[j-1];	//���������� �̵��ϰ� ���ڸ� ����
				j--;
				if(j > 0 && a[j-1] > temp)	//�տ� ���� ��ũ�� �ݺ�
					move = true;
				else
					move = false;
			}
			a[j] = temp;	//���ڸ��� ����
		
			System.out.println("=======Insertion Sort========"); // ��¹�
			System.out.println("Pass " + (i) + "=>");
			for(int k = 0; k < a.length; k++) {	//���
				System.out.print("| " + a[k] + " |");
				
			}
			System.out.println("\n");
			System.out.println("=============================");
		}
		
		
	}

}