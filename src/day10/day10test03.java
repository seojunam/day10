package day10;

import java.util.Scanner;

public class day10test03 {
	public int sumFunc(int n1,int n2) {
		int sum=0;
		
		sum=n1+n2;
		return sum;// 리턴으로 돌려주는 형은 반환되는 자료형을 일치 시켜준다
		//return 으로 돌려줄수 있는건 하나밖에 없다
		
			
		
	}
	
	
	
	
	
	
	public int[] input() {
	Scanner input =new Scanner(System.in);
	int num1,num2, sum=0;
	
	System.out.println("수 입력 :");
	num1=input.nextInt();
	System.out.println("수 입력:");
	num2=input.nextInt();
		int[]arr =new int[2];
		arr[0]=num1; arr[1]=num2;
		return arr;
	}
	

}
