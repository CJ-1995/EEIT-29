package interFace;

import java.util.Date;

//SimCard: SimCard Product Expirable Warrantable四種型態
public class SimCard extends Product implements Expirable,Warrantable{
 
	@Override
	public int 保固天數() {
		// TODO Auto-generated method stub
		return 7;
	}
	
	@Override
	public Date 最後期限() {
		return expireDate;
	}
	@Override
    public String desc() {
        String description = super.desc();
        description = description +",到期日："+expireDate;
        return description;
    }
	
	private Date expireDate;
	
	public SimCard(String name,int price,Date expireDate) {
			super(name,price);
			this.expireDate = expireDate;
		}

	
	}

