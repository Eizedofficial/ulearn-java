abstract class Client {
    protected double Amount;
    public double getAmount() {
        return Amount;
    }
    public void put(double sum) {
        if(sum > 0)
            Amount += sum;
    }
    public double take(double amount) {
        if(amount <= Amount && amount > 0) {
            Amount -= amount;
            return amount;
        }
        else return 0d;
    }
}

class PhysicalPerson extends Client {

}

class LegalPerson extends PhysicalPerson {
    @Override
    public double take(double amount) {
        if(amount <= Amount && amount > 0) {
            Amount -= amount * 1.01;
			return amount * 0.99;
        }
        else return 0d;
    }
}

class IndividualBusinessman extends PhysicalPerson {
    @Override
    public void put(double sum) {
        if(sum < 0) return;
        double commission = sum < 1000 ? 0.99 : 0.995;
        Amount += sum * commission;
    }
}
