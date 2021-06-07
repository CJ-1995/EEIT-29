import java.io.Serializable;

public class Java_Bean implements Serializable{

	private static final long serialVersionUID = 1L;

	private String gender;
	private String dieOf;
	
	private int quantity;
	private int id;
	
	private double mortality; 
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDieOf() {
		return dieOf;
	}

	public void setDieOf(String dieOf) {
		this.dieOf = dieOf;
	}

	public int getquantity() {
		return quantity;
	}

	public void setquantity(int ranking) {
		this.quantity = ranking;
	}
	public void setid(int id) {
		this.id = id;
	}
	public int getid() {
		return id;
	}

	public double getMortality() {
		return mortality;
	}

	public void setMortality(double d) {
		this.mortality = d;
	}

	public Java_Bean() {
		
	}



}
