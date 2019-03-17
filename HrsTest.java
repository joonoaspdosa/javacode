abstract class Employee{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee{
	public void calcSalary() {
		System.out.println("Salesman �޿� = �⺻�� + �Ǹ� ����");
	}
	public void calcBonus() {
		System.out.println("Salesman ���ʽ� = �⺻�� * 12 * 4");
	}
}

class Consultant extends Employee{
	public void calcSalary() {
		System.out.println("Consultant �޿� = �⺻�� + ������  Ư�� ����");
	}
	public void calcBonus() {
		System.out.println("Consultant ���ʽ� = �⺻�� * 12 * 2");
	}
}

abstract class Manager extends Employee{
	public void calcSalary() {
		System.out.println("Manager �޿� = �⺻�� + �� ���� ����");
	}
}

class Director extends Manager{
	@Override
	public void calcBonus() {
		System.out.println("Director ���ʽ� = �⺻�� + 12*6");
	}
}

public class HrsTest {
	public static void calcTax(Employee e) {
		System.out.println("�ҵ漼 ���");
	}
	
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		s.calcBonus();
		c.calcBonus();
		d.calcBonus();
		
		//Salesman �ҵ漼
		calcTax(s);
		//Consultant �ҵ漼
		calcTax(s);
		//Director �ҵ漼
		calcTax(s);
		
		//Object Ŭ���� ��� Ȯ��
		System.out.println(s.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		if(s.equals(c)) {
			System.out.println("���� ��ü");
		}else {
			System.out.println("�ٸ� ��ü");
		}
	}
}
