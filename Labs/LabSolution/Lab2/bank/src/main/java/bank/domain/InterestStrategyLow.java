package bank.domain;

public class InterestStrategyLow implements InterestStrategy{
    @Override
    public double computeInterest(double balance) {
        if (balance > 1000){
            return balance*0.025;
        }
        else{
            return balance*0.015;
        }
    }
}
