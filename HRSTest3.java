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

class Manager extends Employee{
	public void calcSalary() {
		System.out.println("Manager �޿� = �⺻�� + �� ���� ����");
	}
	public void calcBonus() {
		System.out.println("Manager ���ʽ� = �⺻�� + 12*6");
	}
}

class Director extends Manager{
	public void calcBonus() {
		System.out.println("Director ���ʽ� = �⺻�� + 12*6");
	}
}

public class HRSTest3 {
	public static void calcTax(Employee e) {
		if(e instanceof Salesman) {
			System.out.println("Saleman�Դϴ�");
		}else if(e instanceof Manager) {
			System.out.println("Manager�Դϴ�");
		}else if(e instanceof Consultant) {
			System.out.println("Consultant�Դϴ�");
		}else {
			System.out.println("Employee�Դϴ�");
		}
	}
	
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Manager m = new Manager();
		Consultant c = new Consultant();
		
		calcTax(s);
		calcTax(m);
		calcTax(c);
	}
}