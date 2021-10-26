package templateMethod;

public class Concreta1 extends Template{
    @Override
    protected void operazionePrimitiva1() {
        System.out.println("sono operazione primitiva1 concreta1");
    }

    @Override
    protected void operazionePrimitiva2() {
        System.out.println("sono operazione primitiva2 concreta1");
    }
}
