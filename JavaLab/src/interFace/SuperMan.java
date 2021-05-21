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
	
	//lamdba:Functional Interface,介面上只有一個抽象方法 @Functional Interface
	Accountant acc1 = ()-> System.out.println("綜合所得稅");//當程式只有一行時 可省略{ }
	Accountant acc2 = ()->{
		System.out.println("綜合所得稅");
	};
	
	
	Lawyer l = new Lawyer() {
		@Override
		public void 訴訟() {
			// TODO Auto-generated method stub
			
		}
	};
	
	}
}
























