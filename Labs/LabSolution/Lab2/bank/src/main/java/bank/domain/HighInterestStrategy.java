package bank.domain;

public class HighInterestStrategy implements AddInterestStrategy{
    @Override
    public double computeInterest(double balance) {

        if(balance > 5000) return balance * 0.04;
        else if( balance>1000 && balance<5000) return balance * 0.02;
        return balance * 0.01;
    }
}
