package week11;

public class Sorting {
	
	// swap 메서드(위치를 바꾸어줌)
	public static void swap(int[] a, int j, int k){
		int temp = a[j];
		a[j] = a[k];
		a[k] = temp;
		
	}
	// 선택정렬
	public static void selectionSort(int[] a){
		
		int i , j , min; // 변수설정.
		for(i = 0; i < a.length - 1; i++){ // 탐색
			for(j = i+1,min=i; j<a.length; j++){	//반복
				if(a[j] < a[min]) 	//제일 작은 값이 다음 원소보다 크면
					min = j;	//제일 작은 값이 min 
			}
			swap(a,min,i);	// 자리바꾸기.
			System.out.println("=======Selection Sort========");
			System.out.println("Pass " + (i+1) + "=>");
			for(int k = 0; k < a.length; k++) { // 출력
				System.out.print("| " + a[k] + " |");
				
			}
			System.out.println("\n");
			System.out.println("=============================");

			
		}
		
		
	}
	
	public static void bubbleSort(int[] a){
		int i , j , temp = 0;	//변수 설정
		for(i = a.length-1; i >= 0 ; i--) {	//반복 n-1만큼
			temp++;
			for(j=0; j < i; j++) {
				if(a[j]>a[j+1])	//첫번째 원소가 두번째 원소보다 크면
					swap(a,j,j+1);	//교환
				System.out.println("=======Bubble Sort========");
				System.out.println("Pass " + (temp) + "=>");
				for(int k = 0; k < a.length; k++) {	//출력
					System.out.print("| " + a[k] + " |");
					
				}
				System.out.println("\n");
				System.out.println("=============================");
			}
			
			
		}
		
		
	}
	
	public static void insertionSort(int[] a){ // 삽입sort메소드구현
		int i , j , temp; //변수설정.
		boolean move;	//자리이동 판별 변수
		
		for(i = 1; i < a.length; i++){
			temp = a[i];	
			j = i;			//기존값의 변경을 받기위해서 사용하는 임시변수.
			if(a[j-1] > temp)	//앞에 원소가 더 크면 움직여 준다.
				move = true; //참
			else
				move = false; //거짓
			while(move){
				a[j] = a[j-1];	//오른쪽으로 이동하고 빈자리 생성
				j--;
				if(j > 0 && a[j-1] > temp)	//앞에 값이 더크면 반복
					move = true;
				else
					move = false;
			}
			a[j] = temp;	//빈자리에 삽입
		
			System.out.println("=======Insertion Sort========"); // 출력문
			System.out.println("Pass " + (i) + "=>");
			for(int k = 0; k < a.length; k++) {	//출력
				System.out.print("| " + a[k] + " |");
				
			}
			System.out.println("\n");
			System.out.println("=============================");
		}
		
		
	}

}