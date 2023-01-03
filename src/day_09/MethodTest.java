package day_09;


public class MethodTest
{	
	static int add (int num1, int num2)
	{
		int result = num1 + num2;
		return result;
	}
	
	
	
	public static void main(String[] args)
	{// 메모장에 작성한 순서에 맞춰서 10을 더해주는 메소드
		System.out.println(add(12,45));
		MethodTest mt =new MethodTest();
		System.out.println(mt.add(10, 20));
		

	}

}
