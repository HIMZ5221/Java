
public class Oparation {
 public static void main(String[] agrs) {
	
	 
	 
		
	//강제 타입 변환
		//byte result2 = (byte) x+y;
		
		byte bVar = 10;
		int iVar1 = 100;
		long lVar = 1000;
		
		int result3 = (int)( bVar+iVar1+lVar);
		
		double dVal2 = 3.14444;
		double dResult = result3 + dVal2;
		System.out.println(dResult);
		System.out.println(result3);
		
		int iResult = (int) dVal2 + iVar1;
		System.out.println(iResult);
		
		
		// 정수간 연산에서 실수가 나오는 경우
		int iVal2 = 30;
		double dVal3 = iVal2/4.0;
		
		System.out.println(dVal3);
		
		int iVal3 = 4;
		
		dVal3 = (double) iVal2/iVal3;
		
		System.out.println(dVal3);
		
		String str1 = 10+2+"8";
		System.out.println("str1 : " + str1); 
		
		String str2 = 10+"2"+"8";
		System.out.println("str2 : " + str2); //1028
		
		String str3 = "10" + (2+8);
		System.out.println("str3 : " + str3);
		
	//문자열 -> 숫자
		String iNo = "10"; //int
		String bNo = "8"; //byte
		String dNo = "3.222"; //double
		
		int sNo = Integer.parseInt(iNo);
		byte sNo2 = Byte.parseByte(bNo);
		double sNo3 = Double.parseDouble(dNo);
		
		System.out.println(sNo);
		System.out.println(sNo2);
		System.out.println(sNo3);
		
	//숫자 -> 문자열
		String str5 = String.valueOf(sNo);
		String str6 = String.valueOf(sNo2);
		String str7 = String.valueOf(sNo3);
		
		System.out.println(str5+str6+str7);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
