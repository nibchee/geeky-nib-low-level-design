package designPatterns.Behavioural.chainOfResponsibility.example1_LoginFilters;

//Base Middle Ware Class
public abstract class Middleware {
    private Middleware next;

    //Building chain of Middle Ware
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    //subclasses those implement this method
    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String pasword) {
        if (next == null) {
            return true;
        }
        return next.check(email, pasword);
    }
}


