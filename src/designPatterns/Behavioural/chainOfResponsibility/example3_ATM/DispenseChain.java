package designPatterns.Behavioural.chainOfResponsibility.example3_ATM;

public interface DispenseChain {
    void setNextLink(DispenseChain nextChain);

    void dispense(Currency cur);
}
