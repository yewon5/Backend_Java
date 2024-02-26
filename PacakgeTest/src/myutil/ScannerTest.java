package myutil;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO java.util.Scanner

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		System.out.print("나이 입력: ");
		int age = sc.nextInt(); //값을 바로 정수형으로 입력받는다.
		System.out.println("당신의 나이는 " + age + "입니다.");
	}
}
/*

1. 가위 바위 보 게임
	사용자 : 가위
	결과 : 사용자 승리
2.로또 추출기 (절대 중복된 숫자가 나오지 않게 한다.)
*/