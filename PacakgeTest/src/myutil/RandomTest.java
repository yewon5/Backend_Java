package myutil;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		// TODO java.util.Random

		Random r = new Random();
		
		for(int i=0; i<5; i++) {
			System.out.println(r.nextInt()); //int형의 범위 약 -20억 ~ +20억
		}
		 System.out.println();
		 
		for(int i=0; i<5; i++) {
			System.out.println(r.nextInt(10)); //0 <= x < 10까지 임의의 숫자 5개를 무작위로
			System.out.println(r.nextInt(10-0) + 0);		
		}
		 System.out.println();
		 
		for(int i=0; i<5; i++) {
			System.out.println(Math.random()); //0~1사이의 실수
		}
		 System.out.println();
		 
		//21 <= x < 35 사이의 난수 : (최대값 - 최소값) + 최소값
		for(int i=0; i<5; i++) {
			System.out.println(r.nextInt(35-21) + 21);
		}
		 System.out.println();
	}
}
