package b_opearator;

public class Etc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*<< 비트 연산자 >>
      * - |(OR) : 피연산자 중 한쪽이라도 값이 1이면 1을, 그외는 0으로 결과를 얻는다.
      * - &(AND) : 피연산자 양쪽이 모두 1이어야만 1을, 그 외는 0을 결과로 얻는다.  
      * - ^(XOR) : 피연산자의 값이 서로 다를 때만 1을, 같은 때는 0을 결과로 얻는다.
      * - ~(비트전환) : 피연산자를 0은 1로 1은 0으로 바꾼다.
      * - <<(쉬프트) : 피연산자의 각 자리를 왼쪽으로 이동시킨다. 빈칸은 0으로 채운다.
      * - >>(쉬프트) : 피연산자의 각 자리를 오른쪽으로 이동시킨다. 빈칸은 앞자리와 동일한 값으로 채운다.
      * 
      * << 기타 연산자>>
      * - .(참조 연산자) : 특정 범위 내에 속해 있는 멤버를 지칭할 때 사용한다.
      * - (type) : 형변환(casting)
      * - ?:(삼항 연산자) : 조건식? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
      * - instanceof : 참조형 타입 확인
      * */
		
		
	 /* - 10진수 -> 2진수 : 10진수 값을 1일 될 때까지 2로 나눈다.
	  * 10 / 2
	  * 몫5 나머지0
	  * 다시 2로 나눔 몫 2 나머지 1
	  * 다시 2로 나눔 몫 1 나머지 0  -> 1010(2) 
	  * 
	  * 15를 2진수로
	  * 15
	  * 7 1
	  * 3 1
	  * 1 1  -> 1111(2)
	  *  
	  * */
		
		/*- 2진수 -> 10진수 : 각자리에 1, 2, 4, 8, 16, 32, ..를 곱한값을 더한다.
		1 0 1 0
		8 4 2 1 = 10
		
		1111을  10진수로 만들어 주세요
		8421 
		= 15
		*
		*/
		
		// 00001010 : 10
		// 00001111 : 15
		
		// 00001111 -> |(OR) 연산
		System.out.println(10 | 15);
		
		// 00001010 -> &(AND) 연산
		System.out.println(10 & 15);
		
		// 00000101 -> ^(XOR) 연산
		System.out.println(10 ^ 15);
		
		// 11110101 -> ~(bit) 연산
		System.out.println(~10);
		
		// 00010100 -> <<(shift) 연산
		System.out.println(10 << 1);
		
		// 00000101 -> <<(shift) 연산
		System.out.println(10 >> 1);
		
		int x = 10;
		int y = 20; 
		int result = x < y ? x : y;
		// int result = true ? x : y;  
		// int result = x;
		System.out.println(result);
		
		// 점수가 60점 이상이면 합격, 미만이면 불합격
		int score = 60;
		String res = 60 <= score ? "합격" : "불합격" ;
		
		// 주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자, 2면 여자
		int regNo = 1; // 주민등록번호 첫자리
		String gender = regNo == 1? "남자" :"여자";
		System.out.println("당신의 성별은 " + gender + " 입니다.");
		
		// 1도 2 도 아니고 3이온다면? 삼항연산자를 두번 사용
		// gender = regNo ==1 ? "남자" :(regNo ==2? "여자" : "확인불가");
	
		// 두 개의 변수에 저장된 수 중에 큰 숫자를 출력해주세요
		int a= 10;
		int b = 20;
		int max = a > b ? a : b;
		System.out.println(max);
		
		//변수에 저장된 수의 절대값을 출력해주세요
		int d = -20;
		int e = d < 0 ? d*-1 : d;  
		System.out.println(e);
		
		//변수에 저장된 주민등록번호 뒷자리의 첫번째 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력
		//그 외의 숫자는 확인불가
		regNo=6;
		gender = (regNo ==1 || regNo == 3)? "남자" :(regNo ==2 || regNo ==4 ? "여자" : "확인불가");
		System.out.println(gender);
		
	   // 3장 연습문제 
	}

}
