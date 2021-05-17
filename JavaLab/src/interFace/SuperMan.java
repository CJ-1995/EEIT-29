package interFace;

public class SuperMan implements Lawyer,Accountant {
		//三個型態 SuperMan  Lawyer Accountant
	@Override
	public void 訴訟() {

			}
	@Override
	public void 報稅() {
		
	}
	
	public static void main(String[] args) {

	SuperMan sb = new SuperMan();
	
	sb.訴訟(); sb.報稅();
		
	Accountant acc = new Accountant() {
		@Override
		public void 報稅() {
			// TODO Auto-generated method stub
			
		}
	};
	
	acc.報稅();
	
	Lawyer l = new Lawyer() {
		@Override
		public void 訴訟() {
			// TODO Auto-generated method stub
			
		}
	};
	
	}
}
























