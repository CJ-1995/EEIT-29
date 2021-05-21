package exam.e4;

public class Mananger extends Employee{

	private int empno; 
	private String name; 
	private long salary; 
	private long bonus;
	
	public Mananger(int empno, String name, long salary, int empno2, String name2, long salary2, long bonus) {
		super(empno, name, salary);
		empno = empno2;
		name = name2;
		salary = salary2;
		this.bonus = bonus;
	}

	public int getEmpno() {
		return empno;
	}

	public String getName() {
		return name;
	}

	public long getSalary() {
		return salary+bonus;
	}

	public long getBonus() {
		return bonus;
	}
	
	
}
