//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CreditCard{
    private Person owner;
    private   Money balance;
    private  Money creditCardLimit;
    //constructor
    //use deep copy
    public CreditCard(Person owner, Money CreditCardLimit){
        this.owner = owner; //reference to the same person object
        this.creditCardLimit = new Money(creditCardLimit); //creates new money object for credits
        this.balance = new Money(0);  //initialize money as a new money object with 0.


        //accessor (getters) methods
        public Money getBalance(){
         return new Money(balance);
        }
    }

    public static void main(String[] args) {
       //create a Person and Money object
        Person person = new Person("Alice");
        Money creditCard = new Money(1000,50);

        //Create a credit card object
        CreditCard card = new CreditCard (person, creditCardLimit);

        //deisplay the credit card details
        System.out.println(card);
        }







    }
