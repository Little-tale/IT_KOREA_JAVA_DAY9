package day_09;

public class ArrayTest
{	public static void main(String[] args)
	{
		//2차원 배열 선언
		int[] array = {1,2,3,4};
		int array2 [][]= {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		int array3 [][];
		//System.out.println(array2[0][0]);
		
		int arr [][] = new int[2][5]; // 효율은 확실히 안좋아 보임
		int num = 10;
		
		for ( int i= 0; i < arr.length; ++i) // 중첩반복문의 기초다.
		{
			System.out.println((i+1)+"행 "+"////////////////");
			for(int j = 0; j < arr[i].length; ++j) //선취버릇이 매우중요하다.
			{
				arr[i][j] = num;
				System.out.println(arr[i][j]+"");
				num += 10;
			}
			System.out.println((i+1)+"행 "+"//////////////// \n");
		}
		
	}

}
