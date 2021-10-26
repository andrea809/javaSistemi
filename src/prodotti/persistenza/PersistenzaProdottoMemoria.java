package prodotti.persistenza;

import prodotti.dominio.Prodotto;

import java.util.HashMap;
import java.util.List;

public class PersistenzaProdottoMemoria implements Ipersistenza{
    private static PersistenzaProdottoMemoria gestorePersistenza = null;
    HashMap<Long, Prodotto> prodotti;

    public PersistenzaProdottoMemoria() {
        prodotti = new HashMap<>();
    }
    public static synchronized PersistenzaProdottoMemoria getGestorePersistenza() {
        if(gestorePersistenza==null) {
            gestorePersistenza = new PersistenzaProdottoMemoria();
        }
        return gestorePersistenza;
    }

    @Override
    public void aggiungiProdotto(Prodotto p) throws PersistenzaException {
        if (!prodotti.containsKey(p.getId())) {
            prodotti.put(p.getId(), p);
        }
        else
        {
            throw new PersistenzaException("ID duplicated");
        }
    }

    @Override
    public Prodotto ricercaProdotto(long id) throws PersistenzaException {
        return null;
    }

    @Override
    public void aggiornaProdotto(long id) throws PersistenzaException {

    }

    @Override
    public void cancellaProdotto(long id) throws PersistenzaException {

    }

    @Override
    public List<Prodotto> elencoProdotti() throws PersistenzaException  {
        return null;
    }
}
