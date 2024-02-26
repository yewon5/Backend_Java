package myutil;

import java.text.DecimalFormat;

public class DecimalFormatTest {
	public static void main(String[] args) {
		// TODO java.text.DecimalFormat

		double d1 = 2.523, d2 = 3.123;
		double result = d1 + d2;
		System.out.println(result);
		
		DecimalFormat df = new DecimalFormat("#.###"); //#으로 원하는 자리값 정해주기. 실수형 아니고 문자열임
		//System.out.println(df.format(result));
		String strResult = df.format(result);
		System.out.println(strResult);
		
		//다시 실수형으로 바꾸고 싶을 땐?
		//double d3 = (double)strResult; //strResult이 객체라서 캐스팅 안됨.
		
		//java.lang.Wrapper 클래스 : 객체가 아닌 것을 객체화시켜준다. p.496
		double d3 = Double.parseDouble(strResult);
	}
}
