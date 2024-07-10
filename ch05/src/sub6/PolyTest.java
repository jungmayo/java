package sub6;
/*
 * 날짜 : 2024.07.10
 * 이름 : 정지현
 * 내용 : 다형성 실습하기
 * 
 * 다형성(Polymorphism)
 * - 상속 관계에서 부모클래스의 기능을 자식클래스에서 다양한 기능으로 정의하는 특성
 * - 객체(참조변수)의 타입선언을 부모클래스 타입으로 선언하는 것(업캐스팅)
 * - 다형성을 활용해서 효율적인 프로그래밍을 수행
 */
public class PolyTest {
	
	public static void main(String[] args) {
		
		// 다형성 적용된 객체 생성(업캐스팅) : 참조변수 타입을 부모타입으로 바꾸는거
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a1.hunt();
		
		a2.move();
		a2.hunt();
		
		
		a3.move();
		a3.hunt();
		
		// 다운캐스팅 : 부모타입을 자식 타입으로 바꾸는 것
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		// 객체 타입 비교 연산 a1이 tiger가 맞는지 체크
		if(a1 instanceof Tiger) {
			System.out.println("a1은 Tiger입니다.");
		}
		if(a2 instanceof Eagle) {
			System.out.println("a2는 Eagle입니다.");
		}
		if(a3 instanceof Shark) {
			System.out.println("a3는 Shark입니다.");
		}
		
		// 다형성을 활용한 객체배열
		Animal arr[] = {tiger, eagle, shark};
			for(Animal animal : arr)
			for(int i=0; i<arr.length; i++) {
				arr[i].move();
				arr[i].hunt();
				
		}
		/* 다형성 문제 메인에서 PrintSound() 메소드를 호출
		 *  printSound() Dog , Cat 객체를 인자로 받는 매개변수를 선언
		 *  printSound() 매개변수를 이용해 도그 캣
		 *  
		*/
			
			
		Pet cat = new Cat();
		Pet dog = new Dog();
		
		printSound(dog);
		printSound(cat);
		
		}
		public static void printSound(Pet pet) {
			pet.makeSound();
		}
			
}
