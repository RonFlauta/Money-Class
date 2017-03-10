
public class Money {
	private Currency currency;
	private int whole;
	private int cents;
	private int sum1,sum2,diff1,diff2;
	double finalsumWhole;
	
	public Money(Currency currency,int dig1,int dig2){
		this.currency=currency;
		whole=dig1;
		cents=dig2;
	}
	
	public String toString(){
		return this.currency + " " + this.whole +  "." + this.cents;
	}
	
	public void Add(Money moneyy){
		if(this.currency==moneyy.currency){
			sum1=whole+moneyy.whole;
			sum2=cents+moneyy.cents;
			if(sum2>100){
				sum1=sum1+1;
				String samp=Integer.toString(sum2);
				if(samp.substring(2).equals("0")){
				samp=samp.substring(1,2);
				}
				else{
				samp=samp.substring(1);
				}
				sum2=Integer.parseInt(samp);
			}
			
		}
		else{
			
		}
	}
	public void Subtract(Money moneyy){
		if(this.currency==moneyy.currency){
			diff1=whole-moneyy.whole;
			diff2=cents-moneyy.cents;
			if(diff2<0){
				diff1=diff1-1;
				cents=cents+100;
				diff2=cents-moneyy.cents;
				String samp=Integer.toString(diff2);
				if(samp.substring(1).equals("0")){
				samp=samp.substring(0,1);
				}
				else{
				samp=samp.substring(0);
				}
				diff2=Integer.parseInt(samp);
			}
			
		}
		else{
			
		}
	}
	
	public String addToString(){
		return this.currency + " " + sum1+ "." + sum2;
	}
	public String subToString(){
		return this.currency + " " + diff1+ "." + diff2;
	}
	
	
	
}
