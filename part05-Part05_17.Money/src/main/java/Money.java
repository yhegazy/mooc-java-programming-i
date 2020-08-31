
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    /*
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate; 
    */
    
    public Money plus(Money addition){
        Money newMoney = (Money) addition;
   
        int totalEuros = this.euros + newMoney.euros;
        int totalCents = this.cents + newMoney.cents;

        Money total = new Money(totalEuros, totalCents);
        
        return total;
    }
    public boolean lessThan(Money compared){
       
        if(this == compared){
            return true;
        }

        if (this.euros == compared.euros){
            if(this.cents < compared.cents){
                return true;
            }
        }

        if (this.euros < compared.euros){
            return true;    
        }

        return false;
    }
    
    public Money minus(Money decreaser){

        Money newMoney = (Money) decreaser;

        int totalEuros = 0;
        int totalCents = 0;

        if(this.cents == 0){
            if(newMoney.cents == 0){
                totalCents = this.cents - newMoney.cents;
            } else {
                totalCents = 100 - newMoney.cents;
            }
        } else {
            totalCents = this.cents - newMoney.cents;
        }

       
        if(this.cents - newMoney.cents < 0){
            totalEuros = (this.euros - newMoney.euros) - 1;    
                    
        } else {
            totalEuros = this.euros  - newMoney.euros;
        }

        if(totalEuros < 0){
            totalEuros = 0;
            totalCents = 0;
        } 

        Money total = new Money(totalEuros, totalCents);

        return total;
    }

}
