import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {
	
	@Test
	public void storeValueAndCurrency() {
		Money money1=new Money(Currency.PHP,100,50);
		String expected="PHP 100.50";
		String result=money1.toString();
		assertEquals(expected,result);
		
		Money money2=new Money(Currency.EUR,200,75);
		String expected2="EUR 200.75";
		String result2=money2.toString();
		assertEquals(expected2,result2);
		
		Money money3=new Money(Currency.USD,30,52);
		String expected3="USD 30.52";
		String result3=money3.toString();
		assertEquals(expected3,result3);
			
	}
	
	@Test
	public void Operations(){
		Money money1=new Money(Currency.PHP,100,99);
		Money money2=new Money(Currency.PHP,100,99);
		
		money1.Add(money2);
		String result1=money1.addToString();
		String expected1="PHP 201.98";
		assertEquals(expected1,result1);
		
		Money money3=new Money(Currency.PHP,100,56);
		Money money4=new Money(Currency.PHP,50,65);
		
		money3.Subtract(money4);
		String result2=money3.subToString();
		String expected2="PHP 49.91";
		assertEquals(expected2,result2);
	}
	
	

}
