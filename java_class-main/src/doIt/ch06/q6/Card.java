package doIt.ch06.q6;

public class Card {

	private static int serialNum = 1000;
	int cardNumber;
	
	Card() {
		serialNum++;
		cardNumber = serialNum;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	
	
}
