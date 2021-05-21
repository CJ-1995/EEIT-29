package collection;
// T 是typr
public class Note<T extends Number> {
	private  T contet;

	public Note(T contet) {
		this.contet = contet;
	}
	
		public T getContet() {
		return contet;
	}

	public void setContet(T contet) {
		this.contet = contet;
	}

}
