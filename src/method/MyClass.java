package method;

public class MyClass {
	// 여기에 뭔가가 있다. 착한 사람한테만 보임.
	public MyClass(String name) {
		System.out.println(name + "이 만들어 짐");
	}  // 생성자  
	// 클래스를 사용 해서(생성 될 때) 부를 때 최초로 항상 불리는 놈!!
	// 눈에 보이지 않지만 항상 존재. 우리가 위에처럼 임의 적을 수 있음
	// 임의로 내가 생성자 형태를 바꾸면 기존에 있던 
	// 기본 생성자는 없어짐.
	// 기본 생성자를 쓸려면 기본생성자를 명시 해야함(작성)
	// public MyClass() {} --> 이걸 써줘야 함.
	
	// 클래스 안에는 멤버 변수와 멤버 메소드가 존재
	// 메소드를 만들어 보자!!
	public void method() {
		System.out.println("나는 메소드!!");
		System.out.println("나는 MyClass안에 있어요!!");
	}
	// 메소드를 다른 이름으로 계속 만들어 보자
	
}

