public class CmdArg {
	public static void main(String[] args) {
		// TODO Command Line Argument
		
		//System.out.println(args[0]); 
		//System.out.println(args[1]); 
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}

	}
}

//java CmdArg 홍길동 실행할 때 홍길동을 넘겨주는 매개변수가 args
//(String[] args) 명령행 인자를 받아주기 위한 배열
//cd C:\Users\acorn\git\EclipseWork\ClassPart2\bin