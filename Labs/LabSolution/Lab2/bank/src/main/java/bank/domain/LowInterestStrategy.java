package bank.domain;

public class LowInterestStrategy implements AddInterestStrategy{

    @Override
    public double computeInterest(double balance) {
        if(balance> 1000) return balance * 0.025;
        return balance * 0.015;
    }
}
