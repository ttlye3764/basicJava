package d_array;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		
		/* * << 배열 >>
		 * - int[] number = new int[5];
		 * - int[] number = new int[]{10, 20, 30, 40, 50};
		 * - int[] number = {10, 20, 30, 40, 50};
		 */
		
		int[] number = new int[5];
		int[] number2 = new int[] {10, 20, 30, 40, 50};
		int[] number3 = {10, 20, 30, 40, 50};
		
		System.out.println(number[1]);
		System.out.println(number2[4]);
		System.out.println(number3[3]);
		
		//배열은 참조형 타입이다.
		int[] array; // 배열의 주소를 저장할 공간이 만들어 진다.
		array = new int[5]; // 배열이 생성되고 그 주소가 저장된다.
		//new : 새로운 저장공간 생성 및 주소 반환
		//int[5] : int를 저장할 수 있는 5개의 공간
		//배열 초기화시 기본값이 저장된다.
		
		System.out.println(array); 
		
		System.out.println(array[0]); //실제 값이 접근하기 위해서는 index를 지정해줘야 한다.
		// index에는 int만 사용할 수 있다. (리터럴, 변수, 상수, 연산 등)		
		// 배열의 최대 크기는 int의 최대값(약20억)이다.
		
		String arrayStr = Arrays.toString(array); //배열의 모든 인덱스에 저장된 값을 문자열로 반환하는 함수
		System.out.println(arrayStr);
		
		int[] iArray1 = new int[]{1, 2, 3}; // 값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = {1, 2, 3}; // 선언과 초기화를 동시에 해야한다.
		int[] iArray3;
		//iArray3 = {1, 2, 3}; // 선언과 초기화를 동시에 해야한다.
		
		array[0] = 10; // 인덱스는 0부터 시작한다.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		//array[5] = 50;  //java.lang.ArrayIndexOutOfBoundsException발생 -> 배열의 인덱스 범위를 벗어났다

		// 정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요
		int[] num = new int[10];
		int sum = 0;
		
		//모든 인덱스에 있는 값을 변경해주세요.
		for(int i=0;i<num.length;i++){
			num[i] = i;
			System.out.print(num[i] + ", ");
		}
		
		System.out.println("");
		
		// 모든 인덱스에 있는 값을 더해주세요
		for(int i=0;i<num.length;i++){
			System.out.print(num[i] + ", ");
			sum = sum + num[i];
		}
		
		System.out.println(sum);
		
		//배열에 숫자를 저장하고 합계와 평균을 구해보자
		int[] numbers = new int[10];
		for(int i=0; i<numbers.length;i++){
			numbers[i] = (int)(Math.random()*100)+1; 
		}
		System.out.println(Arrays.toString(numbers));
		
		int sum1 = 0; //합계
		double avg =0; //평균
		
		for(int i=0;i<numbers.length;i++){
			sum = sum+ numbers[i];
		}
		
		avg = (double) sum/numbers.length;
		
		
		System.out.println("합 ="+sum+ " " + "평균 ="+ avg);
		
		//향상된 for문
		for(int number1 : numbers){ // 배열에 있는 값을 차례대로 변수에 넣는다.
			System.out.println(number1); 
		}
		
		for(int number1 : numbers){
			number1 = 0; // numbers의 값은 변경되지 않는다.
			System.out.print(number1+", "); 
		}
		
		System.out.println();
		System.out.println(Arrays.toString(numbers));
		
		
		//배열에 저장된 숫자들중 최소값과 최대값을 찾아주세요
		int max = numbers[0];
		int min = numbers[0];
		
		for(int i=1;i<numbers.length;i++){

			if(max<numbers[i]){
				max = numbers[i];
			}
			else if(min>numbers[i]){
				min = numbers[i];
			}
			
		}
		System.out.println("최대값은 = " + max + " "+ "최소값은 = " + min);
		
		
		
		int[] shuffle = new int[30];
		for(int i =0; i< shuffle.length; i++){
			shuffle[i] = i+1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		int temp = 0;
		
		
		int count=0;
		
		
		while(count<100){
			int a = (int)(Math.random()*shuffle.length);
			
			 temp = shuffle[0];
			 
			 shuffle[0] = shuffle[a];
			 
			 shuffle[a] = temp;
			 
			 count ++;
		}
			System.out.println(Arrays.toString(shuffle));
		
			//1~10사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요
			
		int[] num2 =new int[500];
		int c0 =0;
		int c1=0;
		int c2 =0;
		int c3 =0;
		int c4=0;
		int c5=0;
		int c6 =0;
		int c7 =0;
		int c8 =0;
		int c9 =0;
		int c10=0;
		
			for(int i=0; i<num2.length;i++){
				int random = (int)(Math.random()*10)+1;
				num2[i] = random;
				
				if(num2[i]==1){
					c1++;
				}else if(num2[i]==2){
					c2++;
				}else if(num2[i]==3){
					c3++;
				}else if(num2[i]==4){
					c4++;
				}else if(num2[i]==5){
					c5++;
				}else if(num2[i]==6){
					c6++;
				}else if(num2[i]==7){
					c7++;
				}else if(num2[i]==8){
					c8++;
				}else if(num2[i]==9){
					c9++;
				}else if(num2[i]==10){
					c10++;
				}
			}
			System.out.println("1 생성 횟수 : " + c1);
			System.out.println("2 생성 횟수 : " + c2);
			System.out.println("3 생성 횟수 : " + c3);
			System.out.println("4 생성 횟수 : " + c4);
			System.out.println("5 생성 횟수 : " + c5);
			System.out.println("6 생성 횟수 : " + c6);
			System.out.println("7 생성 횟수 : " + c7);
			System.out.println("8 생성 횟수 : " + c8);
			System.out.println("9 생성 횟수 : " + c9);
			System.out.println("10 생성 횟수 : " + c10);
			
			
			
			//위 문제의 최소값, 최대값, 반복횟수를 입력받아 각 생성된 횟수를 출력해주세요
			
		Scanner scan = new Scanner(System.in);
		
		
		
		
		System.out.println("최소값을 입력하세요 : "); //5
		
		int min1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("최대값을 입력하세요 : "); // 30
		
		int max1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("반복횟수를 입력하세요 : "); // 50
		
		int repeat = Integer.parseInt(scan.nextLine());
		
		int[] pro = new int[repeat];
		
		int count2 =0;
		
		int[] total = new int[max1-min1];
		
		for(int i=0;i<pro.length;i++){
				pro[i] = (int)(Math.random()*(max1-min1))+min1;
		}
		
		System.out.println(Arrays.toString(pro));
		
		for(int i=0;i<pro.length;i++){
			for(int j= min1; j<max1;j++){
				if(pro[i]==j){
					total[i] ++;  
				}
				count2 = 0;
			}
				
		}
		for(int i=0;i<total.length;i++){
			System.out.println(i+1 + "생성 횟수 = "+ total[i]);
		}
			
			
			
		/*for(int i=0; i<shuffle.length; i++){
		 * 
			int a = (int)(Math.random()*29)+1;
			
			 shuffle[0] = shuffle[a];
			 
			 System.out.println(i);
			
		}
		
		System.out.println(Arrays.toString(shuffle));*/
		
		
	}

}
