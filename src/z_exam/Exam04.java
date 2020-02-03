package z_exam;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [4-1]다음의 문장들을 조건식으로 표현하라.
		 *  1. if(x>10&&x<20){
			System.out.println("true");
		    } 
		 *  
		 *  2.char ch = 'a';
         		if(!(ch ==' '|| ch =='\t')){
		     	System.out.println("true");
		       }
		       
		    3. char ch = 'H';
	        	 if(ch=='x' ||ch=='X'){
		        	System.out.println("true");
		           }
		           
		    4. if(0<=ch&&ch<=10){
		     	System.out.println("true");
		         }
		    5. ('A'<=ch&&ch<='Z')||('a'<=ch&&ch<='z')
		    
		    6. year%400==0 || (year%4==0&&year%100!=0)
		    7. if(powerOn==false){
		    		sysout("true")
		    		}
		    8. str.equals("yes")
		    
		    [4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합
		    int sum=0;
			for(int i=1; i<=20; i++){
				if(!(i%2==0||i%3==0)){
					sum+= i;
				}
			}
			System.out.println(sum);
			
			[4-3]
			int sum =0;
		
	     	for(int i = 1; i<=10; i++){
			for(int j = 1; j<=i; j++){
				sum = sum + j;
	    		}
			//
	        	}
	           	System.out.println(sum);
	        	}
	        	
	        [4-4]
	        int sum =0;
		    int i = 0;
		     while(sum < 100){
			i++;
			if(i%2==1){
				sum = sum +i;
			}else{

				sum = sum -i;
			}
		}
		System.out.println(i);
	        
		    [4-5]
		    int i =0;
			int j =0;
			
			while(i<=10){
				while(j<=i){
					System.out.print("*");
					j++;
				}
					j=0;
					i++;
			
				System.out.println();
			}
				System.out.print
		
		[4-6]
		int a = (int)(Math.random()*6)+1;
		int b = (int)(Math.random()*6)+1;
		
		if(a==1&&b==5){
			System.out.println("첫번째 주사위는 " + a +"두번째 주사위는 " + b);
		}else if(a==2&&b==4){
			System.out.println("첫번째 주사위는 " + a +"두번째 주사위는 " + b);
		}else if(a==3&&b==3){
			System.out.println("첫번째 주사위는 " + a +"두번째 주사위는 " + b);
		}else if(a==4&&b==2){
			System.out.println("첫번째 주사위는 " + a +"두번째 주사위는 " + b);
		}else if(a==5&&b==1){
			System.out.println("첫번째 주사위는 " + a +"두번째 주사위는 " + b);
		}else{
			System.out.println("첫번째 주사위는 " + a +"두번째 주사위는 " + b);
		}
		
		[4-7]
		int value = (int)(Math.random()*6)+1;
		
		[4-8]
		for(int x =0; x<=10; x++){
			for(int y =0; y<=10; y++){
				if((2*x+4*y)==10){
					System.out.println("x = "+ x + " , "+ "y = " + y);
		
		[4-10]
		int num = 12345;
		int sum = 0;
		
		while(num>0){
			sum = sum+ num%10;
			num = num/10;
		}
		System.out.println(sum);
		
		[4-11]
		int num1 =1;
		int num2 = 1;
		int num3 =0;
		System.out.print(num1+ ", "+num2);
		for(int i=0;i<8;i++){
			num3 = num1+num2;
			System.out.print(", "+num3);
			num1=num2;
			num2=num3;
		}
		
				}
			}
		[4-14]
		
		int answer = (int)(math.random()*100+1)
		
		if(input<answer){
		sysout (input보다 작아여"")
		}
		[4-15]
		result = result*10 + tmp%10;
		tmp = tmp/10;
		
		[4-15]
		int number = 1234567;
		int tmp = number;
		int result =0;
		
		while(tmp != 0){
			result = result*10 + tmp%10;
			tmp = tmp/10;
			
			System.out.println("변환값 : "+ result);
			System.out.println("다음값: "+ tmp);
			 */
		
		
		
		// 2 7 8 - 1s 1b 1o
		// 2 8 7 - 0s 2b 1o
		
		// 8 7 2 - 0s 2b 1o
		// 9 2 8 - 2s 0b 1o
		// 1 3 4 - 0s 1b 2o
		
		
		
		// 3 2 8 - 2s ob 1o
		// 4 2 8 
		Scanner scan = new Scanner(System.in);
		
		int an1 =0;
		int an2 = 0;
		int an3 =0;
		
		while(an1==an2||an1==an3||an2==an3){
		an1 = (int)(Math.random()*9)+1;  
		an2 = (int)(Math.random()*9)+1;
		an3 = (int)(Math.random()*9)+1;
		}
		
		System.out.println( an1+ " " + an2+ " " + an3 );
		System.out.println("야구경기 시~작 세자리 입력해라이");
		int in1 = Integer.parseInt(scan.nextLine());
		int in2 = Integer.parseInt(scan.nextLine());
		int in3 = Integer.parseInt(scan.nextLine());
		
		int s =  0;
		int b = 0;
		int o = 0;
		
		int i=0;
		
		do{
			
			if(an1==in1){
				s++;
			}else if(an1==in2){
				b++;
			}else if(an1 ==in3){
				b++;
			}else{
				o++;
			}
			
			if(an2==in2){
				s++;
			}else if(an2==in1){
				b++;
			}else if(an2 ==in3){
				b++;
			}else{
				o++;
			}
			
			if(an3==in3){
				s++;
			}else if(an3==in1){
				b++;
			}else if(an3 ==in2){
				b++;
			}else{
				o++;
			}
				if(an1==in1 && an2== in2 && an3 == in3){
					System.out.println(s+" 스트라이크 ");
					break;
				}else{
					System.out.println(s+" 스트라이크 " + b + " 볼  " + o + "아웃");
					System.out.print("다시 3자리입력");
					s= 0;
					b=0;
					o=0;
				}
			
			
			
			
			 in1 = Integer.parseInt(scan.nextLine());
			 in2 = Integer.parseInt(scan.nextLine());
			 in3 = Integer.parseInt(scan.nextLine());
			
			
		}
		while(!(an1==in1&&an2==in2&&an3==in3));
		
		
		
		
		
	}
		
		

	
}


