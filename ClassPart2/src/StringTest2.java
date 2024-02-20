public class StringTest2 {
	public static void main(String[] args) {
		// TODO String클래스 API
		
		//동일한 인스턴스를 만들지 않는다. 강제로 인스턴트를 생성하고자 할 때는 String 객체를 생성한다.
		String str1 = "java";
		String str2 = new String("java"); 

		System.out.println(str1.equals(str2)); //true equals 값을 비교한다.
		System.out.println(str1==str2); //false == 주소를 비교한다.
		
		
		//절대 수정 불가
		String str3 = "javu";
		str3 ="java"; //덮어쓰지 않고 새로운 인스턴스를 생성한다.
		String str4 = str3.concat("is number one"); //새로운 인스턴스를 생성한다.
		
		System.out.println(str3==str4); //false 주소 다름.
		
		
		//수정 가능 StringBuffer클래스 이용.
		StringBuffer sb1 = new StringBuffer("java");
		StringBuffer sb2 = sb1.append("is nuber one");
		
		System.out.println(sb1==sb2); //true 주소 같음.
		
		
		
/*		
  		String str1 = "java";
		String str2 = "java"; 
		//문자열이 똑같을 경우 인스턴스를 또 만들지 않기때문에 str1 str2 두개의 주소는 같다. 메모리의 낭비를 막을 수 있다.

		System.out.println(str1.equals(str2)); //true equals 값을 비교한다.
		System.out.println(str1==str2); //true == 주소를 비교한다.
 
 		//값이 달라지면 주소도 달라진다.
		String str1 = "java1";
		String str2 = "java"; 
		//문자열이 똑같을 경우.인스턴스를 또 만들지 않는다. 메모리의 낭비를 막을 수 있다.
		//str1 str2 두개의 주소는 같다.
		
		System.out.println(str1.equals(str2)); //false equals 값을 비교한다.
		System.out.println(str1==str2); //false == 주소를 비교한다.
*/
	}
}
