package myutil;

import java.util.StringTokenizer;

public class StringTokenizerTest { //StringTokenizer 문자열을 나눠주는 클래스

	public static void main(String[] args) {
		// TODO java.util.StringTokenizer

		String str = "홍길동,임꺽정,신돌석,유비";
		
		//split 방식 반복문 사용
		String[] names = str.split(","); //하나의 구분자로만 구분 가능
		for(String n : names) { //for-each 루프
			System.out.println(n);
		}
		//System.out.println(str.split(","));
		//[Ljava.lang.String;@6f2b958e 배열의 주소
		System.out.println("----------------------");
		
		//StringTokenizer 방식 hasMoreElements 메서드 사용
		StringTokenizer token = new StringTokenizer(str, ",");
		System.out.println(token.countTokens()); //몇개로 분리시킬 수 있는지
		while(token.hasMoreElements()) {
			System.out.println(token.nextToken());
		}
		System.out.println("----------------------");
		
		String str2 = "홍길동=임꺽정;신돌석,유비 관우+장비";
		
		token = new StringTokenizer(str2, "=;, +"); //여러개의 구분자로 구분 가능
		System.out.println(token.countTokens());
		while(token.hasMoreElements()) {
			System.out.println(token.nextToken());
		}
		System.out.println("----------------------");

		String str3 = "JavaTM 언어 사양 제2판 : James Gosling, Bill joy, Gut Steele, Gilad Bracha : 무라카미 미사아키 : 피어슨 에듀케이션 : 2000 : 5500";
		
		token = new StringTokenizer(str3, ":,"); //여러개의 구분자로 구분 가능
		 
		while(token.hasMoreElements()) {
			System.out.println(token.nextToken());
		}
		
		
		/* 
		 * 책 이름 : JavaTM 언어 사양 제2판
		 * 저자 : James Gosling
		 * 		 Bill joy
		 * 		 Gilad Bracha
		 * 역자 : 무라카미 미사아키
		 * 출판사 : 피어슨 에듀케이션
		 * 출판연도 : 2000
		 * 가격 : 5500
		 */
	}
}
