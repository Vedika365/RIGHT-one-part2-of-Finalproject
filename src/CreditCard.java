//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CreditCard {
    //data fields
    private Person owner;
    private Money balance;
    private Money creditCardLimit;

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

    public Money getCreditCardLimit() {
        return new Money(creditCardLimit);
    }
    //calling toString method
    public String getPersonals() {
        return owner.toString();
    }

    //the charge method
    public void charge(Money amount) {
        Money newBalance = balance.add(amount);

        if (newBalance.compareTo(creditCardLimit) > 0) {
            System.out.println("the charge exceeds the credit Limit");
        } else {
            balance = newBalance;
            System.out.println("Charge successfuul " + amount);
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment done" + amount);
    }

}
