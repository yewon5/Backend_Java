import java.io.IOException;

/* 1. 반복문을 이용해서 계속 사용할 수 있게 수정 
 * 2. 끝나는 조건을 메뉴에서 q를 입력하면 종료 
 * 3. 클래스로도 만들어보기. */


public class Exam2 {
	public static void main(String[] args) throws IOException {
//		/* 도움말 시스템 */
		char choice;
		System.out.println("Help on: ");
		System.out.println("  1. if");
		System.out.println("  2. switch");
		System.out.print("Choose one: ");
		choice = (char) System.in.read();

		System.out.println("\n");

		switch(choice){
		case '1':
		System.out.println("The if:\n");
		System.out.println("if(condition) statement;");
		System.out.println("else statement;");
		break;
		case '2':
		System.out.println("The switch:\n");
		System.out.println("switch(expression){");
		System.out.println("   case constant:");
		System.out.println("      statement sequence");
		System.out.println("      break;");
		System.out.println("   //...");
		System.out.println("}");
		break;
		default:
		System.out.print("Selection not found");
		
		}
	}
}
