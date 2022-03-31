package day10;

import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {
	/*
	int num=10;
	if(true) {
		num+=100;
	}System.out.println(num);
	
	if(true) {
		int num=10;
		num+=100;
	}System.out.println(num);*/
	
	
	day10test03 t03 =new day10test03();
	
	// t03.input();
	Scanner input =new Scanner(System.in);
	int num1,num2, sum=0;
	
	System.out.println("수 입력 :");
	num1=input.nextInt();
	System.out.println("수 입력:");
	num2=input.nextInt();
	
	int a=t03.sumFunc(num1,num2);
	System.out.println("두 수합 :"+a);
	int[] b= t03.input();
	System.out.println("배열 0:"+b[0]);
	System.out.println("배열 1:"+b[1]);
	
	
}
}
