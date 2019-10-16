public class SimpleCardDeckTest {
	public static void main(String[] args){
		//create the object directly
		SimpleCardDeck deck = new SimpleCardDeck();
		
		//access member variables "cards"
		System.out.println(deck.cards[0]);
		System.out.println(deck.cards[10]);
		System.out.println(deck.cards[51]);
		
		
		//calling instance method
		deck.list();
	}
}