package templateMethod;

public abstract class Template {
    public final void TemplateMethod() {
        // dobbiamo farla ma non sappiamo come farla perchè variabile nella'algoritmo
        operazionePrimitiva1();
        // FAcciamo qualcosa che sappiamo fare e va fatta nel modo che diciamo noi
        // questa parte potrebbe non esserci
        faiAssolutamenteQuesto();
        // dobbiamo farla ma non sappiamo come farla perchè variabile nella'algoritmo
        operazionePrimitiva2();
        // eseguiamo qualcosa che le sottoclassi potrebbero cambiare
        facciamoQualcosa();
    }

    protected abstract void operazionePrimitiva1();
    protected abstract void operazionePrimitiva2();
    protected final void faiAssolutamenteQuesto() {
        System.out.println("sto facendo assolutamente questo");
    };
    protected void facciamoQualcosa() {
        System.out.println("sto facendo qualcosa nella classe base astratta");
    }
}
