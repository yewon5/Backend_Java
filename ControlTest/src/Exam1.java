import java.util.Scanner;
public class Exam1 {
	public static void main(String[] arge) {
		/* 1. 데이터를 입력받아서 문자인지 아닌지를 판별하는 프로그램
		 * 단, 문자인 경우 대문자와 소문자도 구별해서 출력하시오. */
		
				Scanner sc = new Scanner(System.in);
				
				System.out.print("문자를 입력하세요. : ");
				String str = sc.nextLine();
				
		        if (str.length() == 1) {
		            char ch = str.charAt(0);
		            if (isKorean(ch) || isEnglish(ch)) {
		                System.out.print("문자입니다. ");
		                if (Character.isUpperCase(ch)) {
		                    System.out.println(ch +"는 대문자입니다");
		                } else if (Character.isLowerCase(ch)) {
		                    System.out.println(ch +"는 소문자입니다");
		                }
		            } else {
		                System.out.println("문자가 아닙니다.");
		            }
		        } 
		        sc.close();
		    }

		    // 주어진 문자가 한글인지를 판별하는 메서드
		    private static boolean isKorean(char ch) {
		        return (ch >= '가' && ch <= '힣') || (ch >= 'ㄱ' && ch <= 'ㅣ');
		    }

		    // 주어진 문자가 영어 알파벳인지를 판별하는 메서드
		    private static boolean isEnglish(char ch) {
		        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
		    
		
		
		
		/* 2. 키보드로부터 숫자를 입력받아 합계를 출력하는 예제
		 * 조건 1) 0을 입력하면 종료
		 * 조건 2) 총 합계와 함께 홀수의 합과 짝수의 합도 구하시오.*/
		
		/* 3. 전자 계산기(사칙연산)를 반복문을 이용하여 작성하시오.
		 * 조건) x를 입력하면 종료 */
		
	}
}
