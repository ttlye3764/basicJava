package b_opearator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * << 산술 연산자 >>
		 * - + : 더하기
		 * - - : 뺴기
		 * - * : 곱하기
		 * - / : 나누기
		 * - % : 나머지
		 * - 이항 연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다.  
		 */
		
		int a = 10+ 20 - 10 * 5 / 10 % 2;
		// *, /, % 연산자가 +, - 보다 연산의 우선순위가 높다.
		// 우선순위가 동일할 경우 왼쪽부터 연산이 수행된다.
		System.out.println(a);
		
		double d = 10 + 20.3;
		System.out.println(d);
		
		// 강제적으로 형변환을 하지 않으면 작은 쪽에서 큰 쪽으로 형변환이 자동으로 이루어진다
		// double d = (int)10 + (double)20.3; 이기 때문에 자동으로 int형이 double형으로 형변환 되어 표현된다.
		
		byte b = 10;
		short c = 20;
		
		a = c - b;
		
		
		// java는 연산을 할 때 최소한 4byte를 가지고 연산을 한다. 그래서 4byte보다 작은 자료형들의 연산 시 int형으로 형변환 되어 계산된다.
		
		long e1 = 1000000 * 1000000;
		System.out.println(e1); // overflow발생 
		long e2 = (long)1000000 * 1000000; // 피연산자 중 하나는 long이어야 결과 값으로 long을 얻는다.
		long e3 = 1000000L * 1000000; // 피연산자 중 하나는 long이어야 결과 값으로 long을 얻는다.
		System.out.println(e2); 
		System.out.println(e3);
		
		double f1 = 10 / 4; //double 타입의 변수에 저장을 했지만 피연산자가 둘다 int이기 때문에 소수점 값이 날아가고 2가 저장됌
							//피연산자 중 최소한 하나는 double 타입이여야 소수점 뒷자리가 안날아감
		System.out.println(f1);
		double f2 = 10/ 4.0;
		System.out.println(f2);
		
		int f3 = 10 % 4; // 10을 4로 나눈 나머지
		System.out.println(f3);
		
		//정수는 0으로 나눌 수 없다.
	//	int g1 = 10 /0;
	//System.out.println(g1); // 런타임 에러(실행 했을 때 콘솔창에서 발생하는 에러) 발생
		float g2 = 10.0f / 0;
		System.out.println(g2); // 실수는 0으로 나눠도 에러가 발생하지 않지만 infinity라는 값 출력
		float g3 = 0 / 0f;
		System.out.println(g3); // Naj P j0\\\Pnot a num
		
		int h1 = 'A' + 1;
		System.out.println(h1);
		
		int h2 = 'D' - 'A';
		System.out.println(h2);
		
		//char형인 문자형이 연산을 위해 더 큰 자료형인 int형으로 형변환이 되어 계산된다.

		int h3 = '5'- '0';
		System.out.println(h3);
		//산술 연산자와 대입 연산자를 통해 엽산식을 줄여서 표현할 수 잇\
		
		//산술 연산자와 대입 연산자를 합해 연산식을 줄여서 표현할 수 있다.

				int i = 0;
				i = i + 1;
				i += 1;
				i += 2; //복합연산자
				i = i - 1;
				i -= 1;
				i = i * 2;
				i *= 2;
				i = i / 3;
				i /= 3;
				i = i % 4;
				i %= 4;

				++i; //전위형 : 변수가 참조되기 전 수행
				i++; //후위형 : 변수가 참조된 후 수행
				--i;
				i--;
				
				i = 0;
				System.out.println("++i = "+ ++i);
			
				i = 0;
				System.out.println("i++ = "+ i++);
				System.out.println(i);

				//반올림을 하기위해 0.5를 더하고 소수점을 없애기 위해 int로 형변환 한다.
				//50.35
				double round = 50.55;
				System.out.println((int)(round + 0.5)); 
				System.out.println(Math.round(round));   // 소수점 첫째 자리에서 반올림
				System.out.println((int)(round*10 +0.5) / 10.0); // 소수점 둘째 자리에서 반올림
				
				// 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
				// 1. 123456 + 654321
				// 2. 1번의 결과값 * 123456
				// 3. 2번의 결과값 / 123456
				// 4. 3번의 결과값 - 654321
				// 5. 4번의 결과값 % 123456
				
				/*int A = 123456 + 654321;
				long B = A * 123456L;
				int C = (int)B / 123456;
				int D = C - 654321;
				int E = D % 123456;
				System.out.println(E);*/
				
				long re = 123456 + 654321;
				re = re * 123456;
				re = re / 123456;
				re = re - 654321;
				re = re % 123456;
				System.out.println(re);
		
				/*3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요
				평균은 소수점 둘째자리에서 반올림 해주세요*/
				int a1 = 3;
				int a2 = 5;
				int a3 = 9;
				int sum = a1+ a2+a3;
				//double avg = (double)sum /3;
				double avg = (double)sum/3;
				//((int)(avg*10+0.5) / 10.0)
				System.out.println("합계는 : " + sum);
				System.out.println("평균은 : " + (int)(avg*10 + 0.5)/ 10.0);
				
	}

}
