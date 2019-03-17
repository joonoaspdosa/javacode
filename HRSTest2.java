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

public class HRSTest2 {
	public static void calcTax(Employee e) {
		System.out.println("�ҵ漼 ���");
	}
	
	public static void main(String[] args) {
		Salesman s1 = new Salesman();
		Employee s2 = new Salesman();
		Object s3 = new Salesman();
		
		Object m1 = new Manager();
		Employee m2 = new Manager();
		Manager m3 = new Manager();
		
		Object arr[] = new Object[6];
		arr[0] = s1;
		arr[1] = s1;
		arr[2] = s1;
		arr[3] = s1;
		arr[4] = s1;
		arr[5] = s1;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}