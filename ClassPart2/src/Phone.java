public class Phone {
	public static void main(String[] args) {
		// TODO 전화번호부 프로그램

		//3차원 배열. String은 1차원이라서 대괄호 2개만 붙여준다.
		String[][] phoneNumber = {
				{"tom", "555-1111", "Newyork"},
				{"hong", "555-2222", "서울시 강남구"},
				{"kim", "555-3333", "서울시 강동구"},
				{"lee", "555-4444", "서울시 강북구"}
		};
		
		
		if(args.length>0) { //cmd에서 입력한 인자의 개수. 0개 이상으로 해놓는다.
			String pname = args[0]; //첫번째 인자 hong을 가져온다.
		for(int i=0; i<phoneNumber.length; i++) { 
			if (phoneNumber[i][0].equals(pname)) { //배열의 이름과 cmd에서 입력한 값이 일치하면 출력한다.
				System.out.println("이름 : " + phoneNumber[i][0]);
				System.out.println("전화번호 : " + phoneNumber[i][1]);
				System.out.println("주소 : " + phoneNumber[i][2]);
				return;
			}
		}
		System.out.println("찾는 이름이 없습니다.");
		}

/*
		문제 : cmd창에 입력시 아래와 같이 출력되도록.
		java Phone hong 라고 입력했을때
		이름 : hong
		전화번호 : 555-2222
		주소 : 서울시 강남구
		
		java Phone choi 라고 입력했을때
		찾는 이름이 없습니다.
*/
	}
}
