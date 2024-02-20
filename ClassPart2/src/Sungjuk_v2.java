
public class Sungjuk_v2 {

	public static void main(String[] args) {
		// TODO 2차원 배열을 이용한 성적표

/*
		int[] no = {1, 2, 3};
		int[] kor = {98, 76, 85};
		int[] eng = {90, 55, 73};
		int[] tot = new int[3];
		int[] avg = new int[3];
		int[] rank = new int[3];
*/
		String[] names = {"홍길동", "임꺽정", "신돌석"};
		char[] grade = new char[3]; //객체 생성

		//int[][] sungjuk = new int[3][6];
		//위의 방법 사용하지 않고 1차원배열을 여러개로 묶음처리한다.
		int[][] sungjuk = {
				{1, 98, 90, 0, 0, 0},
				{2, 76, 55, 0, 0, 0},
				{3, 85, 73, 0, 0, 0}
		};
		
		
		//총점
		for(int i=0; i<sungjuk.length; i++) {
			sungjuk[i][3] = sungjuk[i][1] + sungjuk[i][2]; // i번째 3번째 사람한테 
		}
				
		
		//평균
		for(int i=0; i<sungjuk.length; i++) {
			sungjuk[i][4] = sungjuk[i][3] / 2;
		}
		
		
		//학점
		for(int i=0; i<sungjuk.length; i++) {
			if(sungjuk[i][4] >= 90)
				grade[i] = 'A';
			else if (sungjuk[i][4] >= 80)
				grade[i] = 'B';
			else if (sungjuk[i][4] >= 70)
				grade[i] = 'c';
			else if (sungjuk[i][4] >= 60)
				grade[i] = 'D';
			else
				grade[i] = 'F';
		}
		
		
		//등수
		for(int i=0; i<sungjuk.length; i++) {
			sungjuk[i][5] = 1;
			for(int j=0; j<sungjuk.length; j++) {
				if(sungjuk[j][4] > sungjuk[i][4]) {
					sungjuk[i][5]++;
				}
			}
		}
		
		
		System.out.println("**** 성적표 ****");
		System.out.println("학번\t이름\t국어\t영어\t총점\t평균\t학점\t등수");
		System.out.println("------------------------------------------------------------");
		for(int i=0; i<sungjuk.length; i++) {
			System.out.println(sungjuk[i][0] + "\t" + names[i] + "\t"+ sungjuk[i][1] + "\t" + sungjuk[i][2] + "\t" 
		+ sungjuk[i][3] + "\t" + sungjuk[i][4] + "\t" + grade[i] + "\t" + sungjuk[i][5]);
		}
		
		
		System.out.println("\n\n 정렬 후 ...\n");
		
		//2차원 배열은 데이터의 주소값으로 정렬한다.
		for(int row=0; row<sungjuk.length-1; row++) { //행의 반복  data→no
			for(int col=row+1; col<sungjuk.length; col++) {
				if(sungjuk[row][4] < sungjuk[col][4]) {
					int[] temp = sungjuk[row]; //대괄호 1개가 행의 주소
					sungjuk[row] = sungjuk[col];
					sungjuk[col] = temp;
					
					//1차원 배열인 이름과 학점은 따로 정렬해준다.
					char char_temp = grade[row];
					grade[row] = grade[col];
					grade[col] = char_temp;
					
					String str_temp = names[row];
					names[row] = names[col];
					names[col] = str_temp;
					}
				}
			}
		
					
		System.out.println("**** 성적표 ****");
		System.out.println("학번\t이름\t국어\t영어\t총점\t평균\t학점\t등수");
		System.out.println("------------------------------------------------------------");
		for(int i=0; i<sungjuk.length; i++) {
			System.out.println(sungjuk[i][0] + "\t" + names[i] + "\t"+ sungjuk[i][1] + "\t" + sungjuk[i][2] + "\t" 
					+ sungjuk[i][3] + "\t" + sungjuk[i][4] + "\t" + grade[i] + "\t" + sungjuk[i][5]);
					}

		
	}
}
