package day10;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {

	Scanner input=new Scanner(System.in);
	Test06 ex6 =new Test06();
	int num1,num2 = 0;
	System.out.println("첫번째 입력:");
	num1=input.nextInt();
	System.out.println("두번째 입력:");
	num2:input.nextInt();
	 int result=ex6.Test06(num1,num2);
	 ex6.outPut(num1,num2,result);
	 
	}
}
