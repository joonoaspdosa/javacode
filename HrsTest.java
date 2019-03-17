abstract class Employee{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee{
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}
	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee{
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅  특별 수당");
	}
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}

abstract class Manager extends Employee{
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
}

class Director extends Manager{
	@Override
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 + 12*6");
	}
}

public class HrsTest {
	public static void calcTax(Employee e) {
		System.out.println("소득세 계산");
	}
	
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		s.calcBonus();
		c.calcBonus();
		d.calcBonus();
		
		//Salesman 소득세
		calcTax(s);
		//Consultant 소득세
		calcTax(s);
		//Director 소득세
		calcTax(s);
		
		//Object 클래스 상속 확인
		System.out.println(s.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		if(s.equals(c)) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
	}
}
