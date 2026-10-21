public class Card
{
   //data fields
   private char suit, rank;
   private String card;
   private int value;
   //constructors
   public Card(String symbol)
   {
      //initialize suit and rank using symbol ("AH", or "10D", or "JS", or "3C")
      this.suit = symbol.charAt(symbol.length()-1);     //grabs last letter
      this.rank = symbol.charAt(0);       //grabs the first character
      setValue();
   }
   
   //methods
   public int getValue()
   {
      return this.value;
   }
   
   public String getCard()
   {
      return this.card;
   }
   
   public int compareTo(Card c)
   {
      return this.value - c.getValue();
   }
   
   private void setValue()
   {
      switch( this.rank )
      {
         case 'a': case 'A':
            this.value = 1; this.card = "Ace of "; break;
         case '2':
            this.value = 2; this.card = "Two of "; break;
         case '1':
            this.value = 10; this.card = "Ten of "; break;
      }
      
      switch( this.suit )
      {
         case 'c': case 'C': this.card += "Clubs"; break;
      }
   }
   
   public String toString()
   {
      return "Card: " + this.card + "\nValue: " + this.value;
   }
}