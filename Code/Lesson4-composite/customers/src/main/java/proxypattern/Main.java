package proxypattern;

public class Main {

    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        //we call process method twice
        object.process();
        object.process();
    }

}
