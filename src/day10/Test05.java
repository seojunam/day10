package day10;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

public class Test05 {
  public int input() {
	  int num =10;
	  return num;
  }
  public void pirnt(int num, String re) {
	  System.out.println(num+re);
  }
  public void op() {
	  int result =input();
	  pirnt(result,"짝수");
  }
  
  public int input02() {
	  /*Scanner int new Scanner(System.in);
	  int num =in.nextInt();
	  return num;
	  */
	  return new Scanner(System.in).nextInt();
  }
  public String op02(int num) {
	  if(num %2==0) {
		  return "짝수";
	  }
	  else {
		  return "홀수";
	  }
	  
	  
	  
  }
  
		  
	  
  
  
  
  public void print02(int n, String s) {
	  System.out.println(n+s);
  }
  public int op03(int num) {
	  if(num %2==0) {
		  return 0;
	  }
	  else {return 1;}
  
  
  
}
  }
