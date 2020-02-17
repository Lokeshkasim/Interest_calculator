package Interest.InterestCalculator;

/**
 * Hello world!
 *
 */
public class Interest 
{
public int calculateSimpleInterest(int amount , int timeInMonths , int interestRate) {
		
		return (( amount * timeInMonths * interestRate)/100 ) ;
		
	}
	public int calculateCompoundInterest(int amount , int timeInMonths , int interestRate) {
		
		return (int) ((Math.pow( 1 + (interestRate / 100.0), timeInMonths / 12.0 ) * amount) - amount) ; 
		
		
	}

}
