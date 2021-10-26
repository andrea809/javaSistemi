package templateMethod;

public class Concreta2 extends Template{
    @Override
    protected void operazionePrimitiva1() {
        System.out.println("sono operazione primitiva1 concreta2");
    }

    @Override
    protected void operazionePrimitiva2() {
        System.out.println("sono operazione primitiva2 concreta2");
    }

    @Override
    protected void facciamoQualcosa() {
        System.out.println("sto facendo qualcosa nella classe derivata");
    }
}
