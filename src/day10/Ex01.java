package day10;
      /*
		 class
		 하나의 자료형이다
		 반복적으로 사용하기 위한 틀
		 class 형으로 변수를 만들면 보통 객체라고 표현한다
     접근 제한자 
     public:내부,외부의 접근 가능
     private:내부에서만 접근 가능
     protected:싱석받은 자식에서 보통 사용
     default(기본값없음):같은 패키지 안에서만 접근
      */
public class Ex01 {
	public static void main(String[] args) {
	  Member m =new Member();	
	  m.age =123;
	  m.name ="rrrr";
	  System.out.println(m.age);
	  System.out.println(m.name);
	  
	  
	  
	  
	  
	}
	

}
