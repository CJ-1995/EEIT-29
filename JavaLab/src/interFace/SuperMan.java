package interFace;

public class SuperMan implements Lawyer,Accountant {
		//三個型態 
	@Override
	public void 訴訟() {

			}
	@Override
	public void 報稅() {
		
	}
	
	public static void main(String[] args) {

	SuperMan sb = new SuperMan();
	sb.訴訟(); sb.報稅();
		
	}

	

}
