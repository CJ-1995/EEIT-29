package equals;

public class Employee {

	private String id;

	public Employee(String id) {
		this.id = id;
	}
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}*/




	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee emp = (Employee)obj;
			//下方的equals 是借用String文字的逐字比較
			//Sting 有改寫ovrride 繼承來的equals方法
			return this.id.equals(emp.id);
		}
		return false;
	}

	@Override
	public int hashCode() {
		//回傳代表物件的數字 通常會跟你equals中比較的屬性有關
		//藉用String hashCode滿足java的規範
		return id.hashCode();
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("id="+id+",GC");
	}
	
	@Override
	public String toString() {
		return String.format("Employee(%s)", id);
	}
	
}
