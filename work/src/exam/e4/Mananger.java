package exam.e4;

public class Mananger extends Employee{

 	private long bonus;
	
	public Mananger(int empno, String name, long salary, long bonus) {
		super(empno, name, salary);
		this.bonus = bonus;
	}

	public long getBonus() {
		return bonus;
	}
}
