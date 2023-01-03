package day_09;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterName;

public class methodTask {

	//메소드 정이 (매게변수O, 리턴값X)
	static void printName(String name)
	{
		for(int i = 0; i<5 ; ++i)
		{
			System.out.println(i+1+"."+name+"님 안녕하세요");
		}
	}
	
	static int getTotalFrom1To10()
	{
		int total = 0;
		for (int i = 0; i <100 ; ++i)
		{
			total += i;
		}
		return total;
	}
	
	static int getTotalOfArray(int[] arNumber)
	{
		if(arNumber.length > 5)
		{
			return Integer.MIN_VALUE;
						//정수형의 최소값
			
		}
		int total = 0;
		for (int i= 0 ; i<arNumber.length;++i)
		{
			total += arNumber[i];
		}
		return total;
	}
	
	static void printAge()
	{
		System.out.println("내나이는 20살 입니다.");
	}
	
	
	static void printTotalFromToNum(int first)
	{
		int total = 0 ;
		for (int i =1; i<(first+1) ; ++i)
		{
			total += i;
		}
		System.out.println("1부터 "+first+" 까지의 합은: "+total);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		// 이름을 넘겨받아서 ~님 안녕하세요 5번 호출 하는 메서드 
		// 메소드 사용(호출)
			printName("김재형");
			
		//2. 1~100까지의 합을 반환하는 메소드 // 매게변수 없이 리턴값있게
			System.out.println(getTotalFrom1To10());
			
			//3. 5개의 정수를 넘겨주면 합을 변환하는 메소드
			// 메소드 정의(매게변수O, 리턴값 O )
		System.out.println(getTotalOfArray(new int[] {1,2,3,4,5}));		
		
		//4. 다 없을때
		printAge();
		
		// 정수 Num을 넘겨받아 1~num 까지의 합을 출력하는 메소드
		// 매게변수 만 쓰기
		printTotalFromToNum(5);
		
	}
}
