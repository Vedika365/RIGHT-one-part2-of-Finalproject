//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CreditCard{
    private Person owner;
    private   Money balance;
    private  Money creditCardLimit;
    //constructor
    //use deep copy
    public CreditCard(Person theOwner, Money CreditCardLimit) {

        owner = theOwner;
        creditCardLimit = new Money(CreditCardLimit);
        balance = new Money(0);

    }
        //accessor (getters) methods
        public Money getBalance() {
         return new Money(balance); //returns a deep copy
        }

        public Money getCreditCardLimit(){
            return new Money(creditCardLimit);
        }

        public String getPersonals(){
            return owner.toString();
        }

        public void charge(Money amount){
            Money newBalance = balance.add(amount);

            if (newBalance.compareTo(creditCardLimit)>0){
                System.out.println("the charge exceeds the credit Limit");
            }
            else {
                balance = newBalance;
                System.out.println("Charge successfuul "+ amount);
            }

            //make payment
            public void Payment(Money amount){
                balance = balance.subtract(amount);
                System.out.println("Payment done"+amount);
            }
        }

    }

    /**public static void main(String[] args) {
       //create a Person and Money object
        Person person = new Person("Alice");
        Money creditCard = new Money(1000,50);

        //Create a credit card object
        CreditCard card = new CreditCard (person,creditCard);

        //display the credit card details
        System.out.println(card);


        }

        //toString method
    public String toString(){
        return "CreditCard : \n"+ "Balance"+owner +"\n"+
                "Balance: " + balance + "\n" + "Credit Card Limit: " + creditCardLimit;
    }


*/