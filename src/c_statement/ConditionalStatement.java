package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * << if문 >> - if : 조건식의 결과가 true이면 블럭안의 문장을 수행한다. - else if : 다수의 조건이
		 * 필요할 때 if 뒤에 추가한다. - else : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 */

		int a = 10;

		if (a < 100) {
			System.out.println("조건식의 연산 결과가 true이면 수행된다.");
		}

		if (a < 10) {
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}

		int regNo = 50; // 주민등록번호 첫자리
		String gender = null; // 성별

		if (regNo == 1) {
			gender = "남자";
		} else if (regNo == 2) { // if블럭 뒤에 else if문으로 조건을 추가할 수 있다.
			gender = "여자";
		} else if (regNo == 3) {
			gender = "남자";
		} else if (regNo == 4) {
			gender = "여자";
		} else {
			gender = "확인불가";
		}
		System.out.println("당신의 성별은 " + gender + " 입니다.");

		regNo = 1;
		gender = null;
		// 수행할 내용이 동일한 경우 논리연산자를 사용해 조건식을 결합할 수 있다.
		if (regNo == 1 || regNo == 3)// 수행할 내용이 한문장일 경우 블럭을 생략할 수 있다.
			gender = "남자";
		else if (regNo == 2 || regNo == 4)
			gender = "여자";
		else
			gender = "확인불가";
		System.out.println("당신의 성별은 " + gender + " 입니다.");

		int score = 30;
		String grade = null;

		if (score >= 80)
			grade = "A";
		else if (60 <= score && score < 80)
			grade = "B";
		else if (40 <= score)
			grade = "C";
		else if (20 <= score)
			grade = "D";
		else
			grade = "F";

		System.out.println(grade);

		score = 50;
		grade = null;

		if (90 <= score) {
			grade = "A";
			if (99 <= score)
				grade = "A+";
			else if (score <= 93)
				grade = "A-";
		} else if (60 <= score && score < 90) {
			grade = "B";
			if (80 <= score)
				grade = "B+";
			else if (score <= 70)
				grade = "B-";
		} else if (40 <= score) {
			grade = "C";
			if (35 <= score)
				grade = "C+";
			else if (score <= 30)
				grade = "C-";
		}

		System.out.println(score + " 점은 " + " " + grade);

		/*
		 * << switch문> > - 조건식과 일치하는 case문 이후의 문장을 수행한다. - 조건식의 결과는 정수와
		 * 문자열만(JDK1.7 이후부터 문자열 허용) 허용한다.
		 */
		regNo = 555;
		gender = null;

		switch (regNo) {
		case 1:
		case 3:
			gender = "남자";
			break;
		case 2:
		case 4:
			gender = "여자";
			break;
		default:
			gender = "확인불가";
		}
		System.out.println("당신의 성별은 " + gender + " 입니다.");

		score = 95;
		grade = null;
		switch (score / 10) {
		case 9:
		case 10:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			gender = "확인불가";
		}
		System.out.println(score + " 는 " + grade);

		// 숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요
		Scanner scan = new Scanner(System.in);

		/*
		 * System.out.println("입력해주세요");
		 * 
		 * int a1 = scan.nextInt();
		 * 
		 * if(a1==0) System.out.println("0입니당."); else
		 * System.out.println("아닙니당");
		 * 
		 * //숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요 System.out.println("입력해주세요"); int
		 * a2 = scan.nextInt();
		 * 
		 * if(a2%2==0) System.out.println("짝수입니다."); else
		 * System.out.println("홀수입니다.");
		 */

		/*
		 * //두개의 숫자를 입력받아 더 큰 숫자를 출력해주세요 System.out.println("첫번째 숫자 입력해라"); int
		 * a3 = scan.nextInt(); System.out.println("두번째 숫자 입력해라"); int a4 =
		 * scan.nextInt(); if(a3>a4) System.out.println(a3); else if(a4>a3)
		 * System.out.println(a4); else System.out.println("똑같아요");
		 */

		// 세개의 숫자를 입력받아 가장 큰 숫자를 출력하세요
		System.out.println("첫번째 숫자 입력해라");
		int num1 = scan.nextInt();
		System.out.println("두번째 숫자 입력해라");
		int num2 = scan.nextInt();
		System.out.println("세번째 숫자 입력해라");
		int num3 = scan.nextInt();
		int max = 0;
/*
		if (a3 > a4) {
			if (a3 > a5)
				max = a3;
			else if (a5 > a3)
				max = a5;
		} else if (a4 > a3) {
			if (a4 > a5)
				max = a4;
			else if (a5 > a4)
				max = a5;
			else
				max = a5;
		}
		System.out.println(max);*/
		
		/*if(num1 < num2 && num2<num3){
			System.out.println(num3);
		}else if(num1<num2 && num3<num2)
			System.out.println(num2);
		else
			System.out.println(num1);*/
		
		if(num1 < num3 && num2<num3){
			System.out.println(num3);
		}else if(num1<num2 && num3<num2)
			System.out.println(num2);
		else
			System.out.println(num1);
		
		
		
		
	}

}
