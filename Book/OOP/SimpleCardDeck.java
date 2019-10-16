public class SimpleCardDeck {
	//cards is a string array member variable
	String[] cards = {"2C","3C","4C","5C","6C","7C","8C","9C","10C",
					"2D","3D","4D","5D","6D","7D","8D","9D","10D",
					"2H","3H","4H","5H","6H","7H","8H","9H","10H",
					"2S","3S","4S","5S","6S","7S","8S","9S","10S",
					"KS","QS","JS","KC","JC","QC","KD","QD","JD",
					"KH","QH","JH","AS","AD","AC","AH"};
	
	//defining list() method
	public void list(){
		for(int i = 0; i < cards.length; i++){
			System.out.println(cards[i]);
		}
	}
}